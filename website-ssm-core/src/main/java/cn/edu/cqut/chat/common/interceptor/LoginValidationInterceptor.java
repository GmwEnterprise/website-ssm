package cn.edu.cqut.chat.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 验证是否需要登陆，若需要登陆则跳转
 */
public class LoginValidationInterceptor implements HandlerInterceptor {

  private List<String> uriList;

  public LoginValidationInterceptor() {
    this.uriList = new ArrayList<>();
  }

  public LoginValidationInterceptor(List<String> uriList) {
    this.uriList = uriList == null ? new ArrayList<>() : uriList;
  }

  public LoginValidationInterceptor addURI(String uri) {
    this.uriList.add(uri);
    return this;
  }

  public LoginValidationInterceptor addURI(String... uriList) {
    this.uriList.addAll(Arrays.asList(uriList));
    return this;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    // TODO 检测是否登陆
    return !uriList.contains(request.getRequestURI());
  }
}
