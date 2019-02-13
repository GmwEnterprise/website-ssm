package cn.edu.cqut.chat.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class SpringDao {

  @Bean
  public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
    ClassPathResource resource = new ClassPathResource("mybatis.config.xml");
    factory.setConfigLocation(resource);
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
    factory.setDataSource(dataSource);
    return factory;
  }
}
