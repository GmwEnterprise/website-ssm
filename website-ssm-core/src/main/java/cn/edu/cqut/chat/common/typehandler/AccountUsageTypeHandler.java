package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.AccountUsageStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(AccountUsageStatus.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class AccountUsageTypeHandler implements TypeHandler<AccountUsageStatus> {

  @Override
  public void setParameter(PreparedStatement ps, int i, AccountUsageStatus parameter, JdbcType jdbcType) throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public AccountUsageStatus getResult(ResultSet rs, String columnName) throws SQLException {
    return AccountUsageStatus.typeOf(rs.getInt(columnName));
  }

  @Override
  public AccountUsageStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
    return AccountUsageStatus.typeOf(rs.getInt(columnIndex));
  }

  @Override
  public AccountUsageStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
    return AccountUsageStatus.typeOf(cs.getInt(columnIndex));
  }
}
