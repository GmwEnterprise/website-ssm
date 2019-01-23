package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.common.base.BaseServiceImpl;
import cn.edu.cqut.chat.common.exception.CrudException;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.mapper.UserMapper;
import cn.edu.cqut.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService {

  @Autowired
  public UserServiceImpl(UserMapper mapper) {
    super(mapper);
  }

  @Override
  @Transactional
  public BaseDto<User> saveUser(User user) {
    int effect = 0;
    Date now = new Date();
    user.setLastModifiedTime(now);
    if (user.getId() != null) {
      effect = mapper.update(user);
    } else {
      user.setCreateTime(now);
      effect = mapper.insert(user);
    }
    if (effect > 0) {
      return new BaseDto<>(user);
    }
    throw new CrudException("保存用户数据失败！");
  }
}
