package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

  User queryOne(Long id);

  List<User> queryAll(User user);

  int insert(User user);

  int update(User user);

  int delete(Long id);
}
