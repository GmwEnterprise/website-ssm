package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;
import cn.edu.cqut.chat.common.enums.RoleType;

public class User extends BaseEntity {

  private String account; // 账户ID
  private String password; // 密码
  private String phone; // 绑定的手机号
  private String email; // 绑定的邮箱
  private String gender; // 性别
  private String idNumber; // 身份证号
  private String realName; // 真实姓名
  private String nickName; // 网名，昵称

  private RoleType roleType; // 用户角色类型

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public RoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(RoleType roleType) {
    this.roleType = roleType;
  }
}
