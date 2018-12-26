package cn.edu.cqut.chat.entity;

public class ChatUser {

  private Integer id;
  private String loginAccount;
  private String loginPassword;
  private String bindPhoneNumber;
  private String bindEmail;
  private String usageState;
  private String nickname;
  private String gender;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLoginAccount() {
    return loginAccount;
  }

  public void setLoginAccount(String loginAccount) {
    this.loginAccount = loginAccount;
  }

  public String getLoginPassword() {
    return loginPassword;
  }

  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
  }

  public String getBindPhoneNumber() {
    return bindPhoneNumber;
  }

  public void setBindPhoneNumber(String bindPhoneNumber) {
    this.bindPhoneNumber = bindPhoneNumber;
  }

  public String getBindEmail() {
    return bindEmail;
  }

  public void setBindEmail(String bindEmail) {
    this.bindEmail = bindEmail;
  }

  public String getUsageState() {
    return usageState;
  }

  public void setUsageState(String usageState) {
    this.usageState = usageState;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
