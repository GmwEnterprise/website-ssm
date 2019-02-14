package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.UserGroupStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(UserGroupStatus.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class UserGroupStatusTypeHandler implements TypeHandler<UserGroupStatus> {

  @Override
  public void setParameter(PreparedStatement ps, int i, UserGroupStatus parameter, JdbcType jdbcType)
      throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public UserGroupStatus getResult(ResultSet rs, String columnName)
      throws SQLException {
    return null;
  }

  @Override
  public UserGroupStatus getResult(ResultSet rs, int columnIndex)
      throws SQLException {
    return null;
  }

  @Override
  public UserGroupStatus getResult(CallableStatement cs, int columnIndex)
      throws SQLException {
    return null;
  }
}
