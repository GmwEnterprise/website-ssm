package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.enums.GroupStatus;

import java.util.Date;

public class ChatGroup {

  private Long id;
  private String groupUid;
  private User groupCreator;
  private Date groupCreateDatetime;
  private String groupName;
  private Integer size;
  private Integer rest;
  private GroupStatus status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Date getGroupCreateDatetime() {
    return groupCreateDatetime;
  }

  public void setGroupCreateDatetime(Date groupCreateDatetime) {
    this.groupCreateDatetime = groupCreateDatetime;
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

  public GroupStatus getStatus() {
    return status;
  }

  public void setStatus(GroupStatus status) {
    this.status = status;
  }
}
