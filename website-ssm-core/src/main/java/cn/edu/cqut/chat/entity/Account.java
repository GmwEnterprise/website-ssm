package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.enums.AccountUsageStatus;

import java.util.Date;

public class Account {

  private Long id;
  private String uid;
  private String password;
  private String bindPhone;
  private String bindEmail;
  private Date registerTime;
  private AccountUsageStatus usageStatus;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }

  public AccountUsageStatus getUsageStatus() {
    return usageStatus;
  }

  public void setUsageStatus(AccountUsageStatus usageStatus) {
    this.usageStatus = usageStatus;
  }
}
