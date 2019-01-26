package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.RoleType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(RoleType.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class RoleTypeHandler implements TypeHandler<RoleType> {

  @Override
  public void setParameter(PreparedStatement ps, int i, RoleType parameter, JdbcType jdbcType) throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public RoleType getResult(ResultSet rs, String columnName) throws SQLException {
    return RoleType.typeOf(rs.getInt(columnName));
  }

  @Override
  public RoleType getResult(ResultSet rs, int columnIndex) throws SQLException {
    return RoleType.typeOf(rs.getInt(columnIndex));
  }

  @Override
  public RoleType getResult(CallableStatement cs, int columnIndex) throws SQLException {
    return RoleType.typeOf(cs.getInt(columnIndex));
  }
}
