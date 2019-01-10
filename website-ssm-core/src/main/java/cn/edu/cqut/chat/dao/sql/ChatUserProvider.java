package cn.edu.cqut.chat.dao.sql;

import cn.edu.cqut.chat.entity.ChatUser;
import cn.edu.cqut.chat.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;

public final class ChatUserProvider {

  public String select(ChatUser user) {
    return new SQL() {{
      SELECT("*");
      FROM("CHAT_USER T");
      if (StringUtil.isNotBlank(user.getLoginAccount())) {
        WHERE("T.LOGIN_ACCOUNT = #{user.loginAccount}");
      }
      if (StringUtil.isNotBlank(user.getBindPhoneNumber())) {
        WHERE("");
      }
      if (StringUtil.isNotBlank(user.getBindEmail())) {

      }
    }}.toString();
  }
}
