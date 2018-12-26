package cn.edu.cqut.chat.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:dbinfo.properties", encoding = "UTF-8")
@MapperScan(
  basePackages = "cn.edu.cqut.chat.dao",
  annotationClass = Repository.class)
public class OrmConfig {

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
    return ds;
  }

  @Bean
  public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setTypeAliasesPackage("cn.edu.cqut.chat.entity");
    factoryBean.setDataSource(dataSource);
    return factoryBean;
  }
}
