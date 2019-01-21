import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnect {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://120.79.155.125:3306/test_query?useSSL=false&useUnicode=true",
        "root",
        "root");
    Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from tb_test");
    while (resultSet.next()) {
      System.out.println(resultSet.getString("name"));
    }
    resultSet.close();
    statement.close();
    conn.close();
  }
}
