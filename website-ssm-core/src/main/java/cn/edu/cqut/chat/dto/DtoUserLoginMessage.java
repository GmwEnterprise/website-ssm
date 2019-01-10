package cn.edu.cqut.chat.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

/**
 * 仅包含User在未登录时可以查看到的信息
 */
public class DtoUserLoginMessage {

  private String account; // 登陆账户
  private String type; // 登陆账户类型，可能是ID/TEL/EMAIL
  private String usageState; // 账号使用状态，使用中/封号

  public String getAccount() {
    return account;
  }

  @NotNull
  @Size(min = 6, max = 128)
  public void setAccount(String account) {
    this.account = account;
  }

  public String getType() {
    return type;
  }

  @NotNull
  public void setType(String type) {
    this.type = type;
  }

  public String getUsageState() {
    return usageState;
  }

  @Null
  public void setUsageState(String usageState) {
    this.usageState = usageState;
  }
}
