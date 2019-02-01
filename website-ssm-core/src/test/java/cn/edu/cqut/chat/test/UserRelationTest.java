package cn.edu.cqut.chat.test;

import cn.edu.cqut.chat.BaseTest;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.enums.RelationType;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotEquals;

public class UserRelationTest extends BaseTest {

  @Test
  public void testMapperQuery() {
    List<UserRelation> userRelationList = userRelationMapper.queryAll(null);
    assertNotEquals(0, userRelationList);
  }

  @Test
  public void testMapperUpdate() {
    userRelationMapper.delete(2L);
  }

  @Test
  public void testMapperInsert() {
    List<User> users = userService.getList(null)
        .stream()
        .filter(user -> !user.getId().equals(1L))
        .collect(Collectors.toList());
    for (int i = 0; i < users.size() - 1; i++) {
      for (int j = i + 1; j < users.size(); j++) {
        UserRelation userRelation = new UserRelation();
        userRelation.setUserA(users.get(i));
        userRelation.setUserB(users.get(j));
        userRelation.setRelationType(RelationType.ATTENTION);
        userRelationService.save(userRelation);
      }
    }
  }
}
