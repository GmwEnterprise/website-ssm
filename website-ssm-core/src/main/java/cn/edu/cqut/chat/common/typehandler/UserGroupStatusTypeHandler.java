package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.GroupStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(GroupStatus.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class UserGroupStatusTypeHandler implements TypeHandler<GroupStatus> {

  @Override
  public void setParameter(PreparedStatement ps, int i, GroupStatus parameter, JdbcType jdbcType)
      throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public GroupStatus getResult(ResultSet rs, String columnName)
      throws SQLException {
    return GroupStatus.typeOf(rs.getInt(columnName));
  }

  @Override
  public GroupStatus getResult(ResultSet rs, int columnIndex)
      throws SQLException {
    return GroupStatus.typeOf(rs.getInt(columnIndex));
  }

  @Override
  public GroupStatus getResult(CallableStatement cs, int columnIndex)
      throws SQLException {
    return GroupStatus.typeOf(cs.getInt(columnIndex));
  }
}
