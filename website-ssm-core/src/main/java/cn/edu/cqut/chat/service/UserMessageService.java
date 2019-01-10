package cn.edu.cqut.chat.service;

/**
 * 用户信息统一管理服务
 */
public interface UserMessageService {

  String validUsername(String username);

  String validEmail(String email);

  String validPhone(String phone);
}
