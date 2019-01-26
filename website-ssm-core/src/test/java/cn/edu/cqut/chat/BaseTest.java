package cn.edu.cqut.chat;

import cn.edu.cqut.chat.common.config.SpringRoot;
import cn.edu.cqut.chat.mapper.UserMapper;
import cn.edu.cqut.chat.mapper.UserRelationMapper;
import cn.edu.cqut.chat.service.UserRelationService;
import cn.edu.cqut.chat.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringRoot.class })
public class BaseTest {

  @Autowired
  protected UserMapper userMapper;

  @Autowired
  protected UserService userService;

  @Autowired
  protected UserRelationMapper userRelationMapper;

  @Autowired
  protected UserRelationService userRelationService;
}
