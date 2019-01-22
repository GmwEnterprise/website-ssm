package cn.edu.cqut.chat.service;

import cn.edu.cqut.chat.common.base.BaseService;
import cn.edu.cqut.chat.dto.UserDto;
import cn.edu.cqut.chat.entity.User;

public interface UserService extends BaseService<User> {

  UserDto saveUser(User user);
}
