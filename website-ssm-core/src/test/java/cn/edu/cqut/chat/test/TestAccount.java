package cn.edu.cqut.chat.test;

import cn.edu.cqut.chat.BaseTest;
import cn.edu.cqut.chat.common.util.StringUtil;
import cn.edu.cqut.chat.entity.Account;
import cn.edu.cqut.chat.mapper.AccountMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TestAccount extends BaseTest {

  @Autowired
  private AccountMapper mapper;

  @Test
  public void testMapper() {
    // 执行过了
    int size = mapper.queryAll(null).size();
    Assert.assertEquals(0, size);

    Account account = new Account();
    account.setUid("GmwEnterprise");
    account.setPassword("12345678");
    Date now = new Date();
    account.setCreateTime(now);
    account.setLastModifiedTime(now);
    account.setBindPhone("13320354693");
    int insert = mapper.insert(account);
    Assert.assertNotEquals(0, insert);

    size = mapper.queryAll(null).size();
    Assert.assertNotEquals(0, size);
  }

  @Test
  public void test() {
    for (int i = 1; i < 11; i++) {
      Account acc = new Account();
      acc.setPassword("123456789");
      acc.setUid(StringUtil.randomUID(11) + i);
      Date now = new Date();
      acc.setCreateTime(now);
      acc.setLastModifiedTime(now);
      mapper.insert(acc);
    }
  }
}
