package cn.edu.cqut.chat.web;

import cn.edu.cqut.chat.enums.Gender;
import cn.edu.cqut.chat.enums.RoleType;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.dto.DtoFactory;
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

  /**
   * 通过id获取用户信息
   * @param id 用户id
   * @return 用户信息
   */
  @GetMapping("/detail/{id}")
  private Map<String, Object> getUser(@PathVariable Long id) {
    User user = userService.get(id);
    if (user != null && user.getRoleType().equals(RoleType.USER)) {
      return DtoFactory.success("获取用户信息成功")
          .setData("user", new BaseDto<>(user))
          .build();
    }
    return DtoFactory.error("获取用户信息失败");
  }

  /**
   * 获取用户信息列表
   * @param condition 查询条件
   * @return 满足查询条件的用户列表
   */
  @GetMapping("/list")
  private Map<String, Object> getUserList(BaseDto<User> condition) {
    List<User> list = userService.getList(null);
    return DtoFactory.success("用户信息")
        .setData("userList", list)
        .build();
  }

  /**
   * 验证即将登陆的账户是否存在
   * @param loginInput 登陆凭据
   * @return 验证结果
   */
  @GetMapping("/valid")
  private Map<String, Object> getUser(String loginInput) {
    // TODO loginInput 可以是手机号/邮箱
    User user = new User();
    user.setAccount(loginInput);
    List<User> userList = userService.getList(user);
    if (userList != null && userList.size() == 1) {
      // TODO 设置 session | token 即将登陆的账户
      return DtoFactory.success("账户存在").build();
    }
    return DtoFactory.error("账户不存在");
  }

  /**
   * 注册
   * @param user 注册信息
   * @param req request
   * @return 注册结果
   */
  @PostMapping("/register")
  private Map<String, Object> register(User user, HttpServletRequest req) {
    user.setId(null);
    user.setRoleType(RoleType.USER);
    if (user.getGender() == null) {
      user.setGender(Gender.SECRET);
    }
    try {
      BaseDto<User> userDto = userService.save(user);
      // 若没有异常，将userDto存入session
      req.getSession().setAttribute("currentUser", userDto);
      return DtoFactory.success("注册成功")
          .setData("current", userDto)
          .build();
    } catch (Exception e) {
      return DtoFactory.error("注册失败：" + e.getMessage());
    }
  }
}
