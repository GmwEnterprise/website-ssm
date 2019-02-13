package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;
import cn.edu.cqut.chat.enums.RelationType;

public class UserRelation extends BaseEntity {

  private User you;
  private User other;
  private RelationType relationType;

  public User getYou() {
    return you;
  }

  public void setYou(User you) {
    this.you = you;
  }

  public User getOther() {
    return other;
  }

  public void setOther(User other) {
    this.other = other;
  }

  public RelationType getRelationType() {
    return relationType;
  }

  public void setRelationType(RelationType relationType) {
    this.relationType = relationType;
  }

  @Override
  public String toString() {
    return "UserRelation{" +
        "you=" + you +
        ", other=" + other +
        ", relationType=" + relationType +
        '}';
  }
}
