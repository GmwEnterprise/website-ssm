package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.common.base.BaseEntity;
import cn.edu.cqut.chat.enums.UserGroupStatus;

public class UserGroup extends BaseEntity {

  private String groupUid;
  private User groupCreator;
  private String groupName;
  private Integer size;
  private Integer rest;
  private UserGroupStatus status;

  public String getGroupUid() {
    return groupUid;
  }

  public void setGroupUid(String groupUid) {
    this.groupUid = groupUid;
  }

  public User getGroupCreator() {
    return groupCreator;
  }

  public void setGroupCreator(User groupCreator) {
    this.groupCreator = groupCreator;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Integer getRest() {
    return rest;
  }

  public void setRest(Integer rest) {
    this.rest = rest;
  }

  public UserGroupStatus getStatus() {
    return status;
  }

  public void setStatus(UserGroupStatus status) {
    this.status = status;
  }
}
