package cn.edu.cqut.chat.web;

import cn.edu.cqut.chat.dto.DtoFactory;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.enums.RelationType;
import cn.edu.cqut.chat.service.UserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/user/relation")
public class UserRelationController {

  private final UserRelationService userRelationService;

  @Autowired
  public UserRelationController(UserRelationService userRelationService) {
    this.userRelationService = userRelationService;
  }

  @GetMapping("/{id}")
  private Map<String, Object> getUserRelation(@PathVariable("id") Long userId) {
    UserRelation condition = new UserRelation();
    User user = new User();
    user.setId(userId);
    condition.setUserA(user);
    List<User> relations = userRelationService.getList(condition)
        .stream()
        .map(UserRelation::getUserB)
        .collect(Collectors.toList());
    return DtoFactory.success("查询用户关系成功")
        .setData("relations", relations)
        .build();
  }

  @GetMapping("/attention")
  private Map<String, Object> attention(Long user, Long concern) {
    User a = new User(), b = new User();
    a.setId(user);
    b.setId(concern);
    userRelationService.makeRelation(a, b, RelationType.ATTENTION);
    return null;
  }
}
