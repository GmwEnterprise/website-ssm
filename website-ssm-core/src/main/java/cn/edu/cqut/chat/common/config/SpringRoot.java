package cn.edu.cqut.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    SpringDao.class,
    SpringService.class })
public class SpringRoot {

}
