package cn.edu.cqut.chat.test;

import cn.edu.cqut.chat.BaseTest;
import cn.edu.cqut.chat.service.AccountService;
import cn.edu.cqut.chat.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestUser extends BaseTest {

  @Autowired
  private AccountService accountService;

  @Autowired
  private UserService userService;

  @Test
  public void test() {
    System.out.println(userService);
  }
}
