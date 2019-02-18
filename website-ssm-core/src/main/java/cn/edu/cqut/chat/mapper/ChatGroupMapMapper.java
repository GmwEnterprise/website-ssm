package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.entity.ChatGroup;
import cn.edu.cqut.chat.entity.ChatGroupMap;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.enums.ChatGroupMemberType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ChatGroupMapMapper {

  List<ChatGroup> queryGroupByAccountUid(@Param("uid") String accountUid);

  List<User> queryUserByGroup(
      @Param("uid") String groupUid,
      @Param("type") ChatGroupMemberType type);

  ChatGroupMap queryByUid(
      @Param("accountUid") String accountUid,
      @Param("groupUid") String groupUid);

  int insert(ChatGroupMap map);

  int update(ChatGroupMap map);

  int delete(Long id);
}
