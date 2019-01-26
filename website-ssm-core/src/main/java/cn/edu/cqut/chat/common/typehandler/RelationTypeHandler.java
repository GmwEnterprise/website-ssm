package cn.edu.cqut.chat.common.typehandler;

import cn.edu.cqut.chat.enums.RelationType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(RelationType.class)
@MappedJdbcTypes(JdbcType.TINYINT)
public class RelationTypeHandler implements TypeHandler<RelationType> {

  @Override
  public void setParameter(PreparedStatement ps, int i, RelationType parameter, JdbcType jdbcType) throws SQLException {
    ps.setInt(i, parameter.getIndex());
  }

  @Override
  public RelationType getResult(ResultSet resultSet, String s) throws SQLException {
    return RelationType.typeOf(resultSet.getInt(s));
  }

  @Override
  public RelationType getResult(ResultSet resultSet, int i) throws SQLException {
    return RelationType.typeOf(resultSet.getInt(i));
  }

  @Override
  public RelationType getResult(CallableStatement callableStatement, int i) throws SQLException {
    return RelationType.typeOf(callableStatement.getInt(i));
  }
}
