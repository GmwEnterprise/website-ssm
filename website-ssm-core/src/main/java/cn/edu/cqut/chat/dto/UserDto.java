package cn.edu.cqut.chat.dto;

import cn.edu.cqut.chat.common.enums.Gender;
import cn.edu.cqut.chat.common.enums.RoleType;
import cn.edu.cqut.chat.entity.User;

public class UserDto {

  private Long id;
  private String account;
  private String phone;
  private String email;
  private String nickName;
  private Gender gender;

  public UserDto() {

  }

  public UserDto(User user) {
    this.id = user.getId();
    this.account = user.getAccount();
    this.phone = user.getPhone();
    this.email = user.getEmail();
    this.nickName = user.getNickName();
    this.gender = user.getGender();
  }

  public UserDto(
      Long id, String account, String phone, String email,
      String nickName, Gender gender, RoleType roleType) {
    this.id = id;
    this.account = account;
    this.phone = phone;
    this.email = email;
    this.nickName = nickName;
    this.gender = gender;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
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

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "id=" + id +
        ", account='" + account + '\'' +
        ", phone='" + phone + '\'' +
        ", email='" + email + '\'' +
        ", nickName='" + nickName + '\'' +
        ", gender=" + gender +
        '}';
  }
}
