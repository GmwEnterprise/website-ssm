package cn.edu.cqut.chat.dao.sql;

import cn.edu.cqut.chat.entity.ChatUser;
import cn.edu.cqut.chat.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;

public final class ChatUserProvider {

  public static String select(ChatUser user) {
    return new SQL() {{
      SELECT("*");
      FROM("CHAT_USER T");
      if (StringUtil.isNotBlank(user.getLoginAccount())) {
        WHERE("T.LOGIN_ACCOUNT = #{loginAccount}");
      }
      if (StringUtil.isNotBlank(user.getBindPhoneNumber())) {
        WHERE("T.BIND_PHONE_NUMBER = #{bindPhoneNumber}");
      }
      if (StringUtil.isNotBlank(user.getBindEmail())) {
        WHERE("T.BIND_EMAIL = #{bindEmail}");
      }
    }}.toString();
  }
}
