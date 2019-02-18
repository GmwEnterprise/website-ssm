package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.enums.RelationType;

public class SocialRelation {

  private Long id;
  private Account you;
  private Account other;
  private RelationType relationType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account getYou() {
    return you;
  }

  public void setYou(Account you) {
    this.you = you;
  }

  public Account getOther() {
    return other;
  }

  public void setOther(Account other) {
    this.other = other;
  }

  public RelationType getRelationType() {
    return relationType;
  }

  public void setRelationType(RelationType relationType) {
    this.relationType = relationType;
  }
}
