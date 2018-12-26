package cn.edu.cqut.chat.dao;

import cn.edu.cqut.chat.entity.ChatUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatUserDao {

  @Select("select * from chat_user where id = #{id}")
  ChatUser selectOneById(Integer id);

  @Select("select * from chat_user where login_account = #{loginAccount}")
  ChatUser selectOneByLoginAccount(String loginAccount);
}
