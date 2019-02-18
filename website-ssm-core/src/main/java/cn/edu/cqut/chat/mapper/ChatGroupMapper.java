package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.entity.ChatGroup;

import java.util.List;

@Mapper
public interface ChatGroupMapper {

  ChatGroup queryOne(Long id);

  List<ChatGroup> queryAll(ChatGroup chatGroup);

  int insert(ChatGroup chatGroup);

  int update(ChatGroup chatGroup);

  int delete(Long id);
}
