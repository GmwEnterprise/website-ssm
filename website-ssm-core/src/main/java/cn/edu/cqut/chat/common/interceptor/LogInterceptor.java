package cn.edu.cqut.chat.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 配置所有请求的日志信息，打印出请求URI，耗时
 */
public class LogInterceptor implements HandlerInterceptor {

  private Logger log = LoggerFactory.getLogger(LogInterceptor.class);

  // 在处理器之前执行的前置方法
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    log.info("请求URI: {}", request.getRequestURI());
    request.setAttribute(String.valueOf(request.hashCode()), System.currentTimeMillis());
    return true;
  }

  // 在处理器之后执行的后置方法
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    Long times = (Long) request.getAttribute(String.valueOf(request.hashCode()));
    long takeTimes = System.currentTimeMillis() - times;
    log.info("请求执行结束, 共耗时 {} 毫秒", takeTimes);
  }

  // 渲染视图后执行的方法
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

  }
}
