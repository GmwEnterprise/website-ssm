package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;

public class Account extends BaseEntity {

  private String uid;
  private String password;
  private String bindPhone;
  private String bindEmail;

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getBindPhone() {
    return bindPhone;
  }

  public void setBindPhone(String bindPhone) {
    this.bindPhone = bindPhone;
  }

  public String getBindEmail() {
    return bindEmail;
  }

  public void setBindEmail(String bindEmail) {
    this.bindEmail = bindEmail;
  }

  @Override
  public String toString() {
    return "Account{" +
        "uid='" + uid + '\'' +
        ", password='" + password + '\'' +
        ", bindPhone='" + bindPhone + '\'' +
        ", bindEmail='" + bindEmail + '\'' +
        '}';
  }
}
