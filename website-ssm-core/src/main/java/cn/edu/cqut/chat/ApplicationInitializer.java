package cn.edu.cqut.chat;

import cn.edu.cqut.chat.common.config.SpringRoot;
import cn.edu.cqut.chat.common.config.SpringMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { SpringRoot.class };
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { SpringMvc.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
}
