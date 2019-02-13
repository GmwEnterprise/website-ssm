package cn.edu.cqut.chat.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Import({
    SpringDao.class,
    SpringService.class,
    DataSourceConfig.class })
@Configuration
@ComponentScan(
    basePackages = "cn.edu.cqut.chat",
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = EnableWebMvc.class))
public class SpringRoot {

}
