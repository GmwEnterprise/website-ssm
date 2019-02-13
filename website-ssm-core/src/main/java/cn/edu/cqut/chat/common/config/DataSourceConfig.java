package cn.edu.cqut.chat.common.config;

import cn.edu.cqut.chat.common.annotation.Mapper;
import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:dbinfo.properties", encoding = "UTF-8")
@MapperScan(
    basePackages = "cn.edu.cqut.chat.mapper",
    annotationClass = Mapper.class)
public class DataSourceConfig {

  @Value("${datasource.driver}")
  String driver;

  @Value("${datasource.url}")
  String url;

  @Value("${datasource.user}")
  String user;

  @Value("${datasource.password}")
  String password;

  @Bean
  public DataSource dataSource() {
    DruidDataSource ds = new DruidDataSource();
    ds.setDriverClassName(driver);
    ds.setUrl(url);
    ds.setUsername(user);
    ds.setPassword(password);
    // 关闭连接后不自动commit，便于事务去控制
    ds.setDefaultAutoCommit(false);
    return ds;
  }
}
