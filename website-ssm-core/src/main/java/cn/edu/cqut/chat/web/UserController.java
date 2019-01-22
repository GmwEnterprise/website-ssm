package cn.edu.cqut.chat.web;

import cn.edu.cqut.chat.common.enums.Gender;
import cn.edu.cqut.chat.common.enums.RoleType;
import cn.edu.cqut.chat.dto.Dto;
import cn.edu.cqut.chat.dto.UserDto;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user", method = { RequestMethod.POST, RequestMethod.GET })
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/detail/{id}")
  private Map<String, Object> getUser(@PathVariable Long id) {
    User user = userService.get(id);
    if (user != null && user.getRoleType().equals(RoleType.USER)) {
      return Dto.success("获取用户信息成功")
          .setData("user", new UserDto(user))
          .build();
    }
    return Dto.error("获取用户信息失败");
  }

  @GetMapping("/list")
  private Map<String, Object> getUserList() {

    return Dto.error("获取用户信息列表失败");
  }

  @GetMapping("/valid")
  private Map<String, Object> getUser(String loginInput) {
    // TODO loginInput 可以是手机号/邮箱
    User user = new User();
    user.setAccount(loginInput);
    List<User> userList = userService.getList(user);
    if (userList != null && userList.size() == 1) {
      // TODO 设置 session | token 即将登陆的账户
      return Dto.success("账户存在").build();
    }
    return Dto.error("账户不存在");
  }

  @PostMapping("/register")
  private Map<String, Object> register(User user, HttpServletRequest req) {
    user.setId(null);
    user.setRoleType(RoleType.USER);
    if (user.getGender() == null) {
      user.setGender(Gender.SECRET);
    }
    try {
      UserDto userDto = userService.saveUser(user);
      // 若没有异常，将userDto存入session
      req.getSession().setAttribute("currentUser", userDto);
      return Dto.success("注册成功")
          .setData("current", userDto)
          .build();
    } catch (Exception e) {
      return Dto.error("注册失败：" + e.getMessage());
    }
  }
}
