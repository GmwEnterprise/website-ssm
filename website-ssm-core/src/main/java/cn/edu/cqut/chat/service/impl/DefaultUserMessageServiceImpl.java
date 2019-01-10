package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.dao.ChatUserDao;
import cn.edu.cqut.chat.entity.ChatUser;
import cn.edu.cqut.chat.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("default")
public class DefaultUserMessageServiceImpl implements UserMessageService {

  private final ChatUserDao userDao;

  @Autowired
  public DefaultUserMessageServiceImpl(ChatUserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public String validUsername(String username) {
    ChatUser user = new ChatUser();
    user.setLoginAccount(username);
    List<ChatUser> userList = userDao.select(user);
    if (userList.size() == 1) {
      return userList.get(0).getUsageState();
    } else if (userList.size() > 1) {
      // 系统录入错误，记录日志
      System.err.println("Error at DefaultUserMessageServiceImpl.java, method = validUsername");
    }
    return null;
  }

  @Override
  public String validEmail(String email) {
    return null;
  }

  @Override
  public String validPhone(String phone) {
    return null;
  }
}
