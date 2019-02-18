package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.ChatGroupMemberType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(ChatGroupMemberType.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class ChatGroupMemberTypeHandler implements TypeHandler<ChatGroupMemberType> {

  @Override
  public void setParameter(PreparedStatement ps, int i, ChatGroupMemberType parameter, JdbcType jdbcType) throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public ChatGroupMemberType getResult(ResultSet rs, String columnName) throws SQLException {
    return ChatGroupMemberType.typeOf(rs.getInt(columnName));
  }

  @Override
  public ChatGroupMemberType getResult(ResultSet rs, int columnIndex) throws SQLException {
    return ChatGroupMemberType.typeOf(rs.getInt(columnIndex));
  }

  @Override
  public ChatGroupMemberType getResult(CallableStatement cs, int columnIndex) throws SQLException {
    return ChatGroupMemberType.typeOf(cs.getInt(columnIndex));
  }
}
