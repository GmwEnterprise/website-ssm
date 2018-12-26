package cn.edu.cqut.chat.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
// import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;/*
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;*/

import java.nio.charset.Charset;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("cn.edu.cqut.chat.web")
public class SpringMvcConfig implements WebMvcConfigurer {

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
    converter.setDefaultCharset(Charset.defaultCharset());
    converters.add(converter);
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
            .allowedOrigins("*")
            .allowCredentials(true)
            .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
            .maxAge(3600);
  }
/*
  @Bean
  public ViewResolver thymeleafViewResolver(ISpringTemplateEngine engine) {
    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
    resolver.setTemplateEngine(engine);
    resolver.setCharacterEncoding("UTF-8");
    return resolver;
  }

  @Bean
  public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    templateEngine.setTemplateResolver(templateResolver);
    templateEngine.setEnableSpringELCompiler(true);
    return templateEngine;
  }

  @Bean
  public SpringResourceTemplateResolver templateResolver( ) {
    SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
    templateResolver.setPrefix("/WEB-INF/views/");
    templateResolver.setSuffix(".html");
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setOrder(1);
    templateResolver.setTemplateMode(TemplateMode.HTML);
    templateResolver.setCacheable(false);
    return templateResolver;
  }*/
}
