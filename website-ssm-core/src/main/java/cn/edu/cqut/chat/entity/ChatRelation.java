package cn.edu.cqut.chat.entity;

import java.util.Date;

public class ChatRelation {

  private Integer id;
  private String userAccount;
  private String userRelation;
  private Date setupDatetime;
  private String relationType;
  private Integer available;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }

  public String getUserRelation() {
    return userRelation;
  }

  public void setUserRelation(String userRelation) {
    this.userRelation = userRelation;
  }

  public Date getSetupDatetime() {
    return setupDatetime;
  }

  public void setSetupDatetime(Date setupDatetime) {
    this.setupDatetime = setupDatetime;
  }

  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }
}
