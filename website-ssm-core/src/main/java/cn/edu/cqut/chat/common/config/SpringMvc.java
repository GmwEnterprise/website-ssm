package cn.edu.cqut.chat.common.config;

import cn.edu.cqut.chat.common.interceptor.LogInterceptor;
import cn.edu.cqut.chat.common.interceptor.LoginValidationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableWebMvc
@ComponentScan("cn.edu.cqut.chat.web")
public class SpringMvc implements WebMvcConfigurer {

  @Bean
  public ViewResolver jspViewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowCredentials(true)
        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
        .maxAge(3600);
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // 添加顺序则是拦截器的执行顺序
    registry.addInterceptor(new LoginValidationInterceptor());
    registry.addInterceptor(new LogInterceptor());
  }
}
