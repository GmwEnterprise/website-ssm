package cn.edu.cqut.chat.dao;

import cn.edu.cqut.chat.dao.sql.ChatUserProvider;
import cn.edu.cqut.chat.entity.ChatUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatUserDao {

  @Results(id = "chatUserMap", value = {
          @Result(property = "id", column = "id"),
          @Result(property = "loginAccount", column = "login_account"),
          @Result(property = "loginPassword", column = "login_password"),
          @Result(property = "bindPhoneNumber", column = "bind_phone_number"),
          @Result(property = "bindEmail", column = "bind_email"),
          @Result(property = "usageState", column = "usage_state"),
          @Result(property = "nickname", column = "nickname"),
          @Result(property = "gender", column = "gender")
  })
  @Select("select * from chat_user where id = #{id}")
  ChatUser selectId(Integer id);

  @Select("select * from chat_user where login_account = #{loginAccount}")
  ChatUser selectAccount(String loginAccount);

  @SelectProvider(type = ChatUserProvider.class, method = "select")
  @ResultMap("chatUserMap")
  List<ChatUser> select(ChatUser user);
}
