package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.common.base.BaseServiceImpl;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.mapper.UserMapper;
import cn.edu.cqut.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService {

  @Autowired
  public UserServiceImpl(UserMapper mapper) {
    super(mapper);
  }
}
