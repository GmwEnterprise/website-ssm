package cn.edu.cqut.chat;

import cn.edu.cqut.chat.common.config.SpringRoot;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.mapper.UserMapper;
import cn.edu.cqut.chat.service.UserService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringRoot.class })
public class Test {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private UserService userService;


  @org.junit.Test
  public void testMapper() {
    User user = userMapper.queryById(1L);
    Assert.assertEquals("root", user.getAccount());
  }

  @org.junit.Test
  public void testService() {
    User user = userService.get(4L);
    user.setPassword("ganmingwei");
    try {
      BaseDto<User> userDto = userService.saveUser(user);
      System.out.println(userDto);
    } catch (RuntimeException e) {
      System.err.println("进入了catch");
    }
  }
}
