package cn.edu.cqut.chat.web.restful;

import cn.edu.cqut.chat.dao.ChatUserDao;
import cn.edu.cqut.chat.entity.ChatUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private ChatUserDao chatUserDao;

  @Autowired
  public TestController(ChatUserDao chatUserDao) {
    this.chatUserDao = chatUserDao;
  }

  @GetMapping("/userid")
  public ChatUser getChatUserById(@RequestParam(defaultValue = "1") Integer id) {
    return chatUserDao.selectOneById(id);
  }
}
