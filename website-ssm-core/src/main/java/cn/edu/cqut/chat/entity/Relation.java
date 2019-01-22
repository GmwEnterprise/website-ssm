package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;
import cn.edu.cqut.chat.common.enums.RelationType;

public class Relation extends BaseEntity {

  private User userA; // 用户本人
  private User userB; // 与用户有关系的人
  private RelationType relationType; // 关注-拉黑-没有关联

  public User getUserA() {
    return userA;
  }

  public void setUserA(User userA) {
    this.userA = userA;
  }

  public User getUserB() {
    return userB;
  }

  public void setUserB(User userB) {
    this.userB = userB;
  }

  public RelationType getRelationType() {
    return relationType;
  }

  public void setRelationType(RelationType relationType) {
    this.relationType = relationType;
  }
}
