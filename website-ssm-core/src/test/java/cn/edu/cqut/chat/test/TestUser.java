package cn.edu.cqut.chat.test;

import cn.edu.cqut.chat.BaseTest;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.enums.Gender;
import cn.edu.cqut.chat.mapper.AccountMapper;
import cn.edu.cqut.chat.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TestUser extends BaseTest {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private AccountMapper accountMapper;

  @Test
  public void test() {
    User entity = new User();
    entity.setGender(Gender.SECRET);
    userMapper.queryAll(entity).stream()
        .filter(user -> user.getId() % 2 == 0)
        .forEach(user -> {
          user.setNickName(user.getNickName().replace("测试", "Test"));
          Date now = new Date();
          user.setLastModifiedTime(now);
          userMapper.update(user);
        });
  }
}
