package cn.edu.cqut.chat.test;

import cn.edu.cqut.chat.BaseTest;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.enums.RelationType;
import cn.edu.cqut.chat.mapper.UserMapper;
import cn.edu.cqut.chat.mapper.UserRelationMapper;
import cn.edu.cqut.chat.service.UserRelationService;
import cn.edu.cqut.chat.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUserRelation extends BaseTest {

  @Autowired
  UserService userService;

  @Autowired
  UserRelationService userRelationService;

  @Test
  public void test() {
    User user = null;
    for (User item : userService.getList(null)) {
      if (user == null) {
        user = item;
      } else {
        UserRelation relation = new UserRelation();
        relation.setYou(user);
        relation.setOther(item);
        relation.setRelationType(RelationType.ATTENTION);
        userRelationService.save(relation);

        relation.setId(null);
        relation.setYou(item);
        relation.setOther(user);
        userRelationService.save(relation);

        user = null;
      }
    }

    UserRelation relation = new UserRelation();
    relation.setRelationType(RelationType.ATTENTION);
    for (UserRelation userRelation : userRelationService.getList(relation)) {
      System.out.println(userRelation);
    }
  }
}
