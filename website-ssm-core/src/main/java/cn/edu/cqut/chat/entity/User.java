package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;
import cn.edu.cqut.chat.enums.Gender;

public class User extends BaseEntity {

  private Account account;
  private Gender gender;
  private String idNumber;
  private String nickName;

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "User{" +
        "account=" + account +
        ", gender=" + gender +
        ", idNumber='" + idNumber + '\'' +
        ", nickName='" + nickName + '\'' +
        '}';
  }
}
