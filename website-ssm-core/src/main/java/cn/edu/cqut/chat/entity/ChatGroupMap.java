package cn.edu.cqut.chat.entity;

import cn.edu.cqut.chat.enums.ChatGroupMemberType;

public class ChatGroupMap {

  private Long id;
  private Account user;
  private ChatGroup group;
  private ChatGroupMemberType type;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account getUser() {
    return user;
  }

  public void setUser(Account user) {
    this.user = user;
  }

  public ChatGroup getGroup() {
    return group;
  }

  public void setGroup(ChatGroup group) {
    this.group = group;
  }

  public ChatGroupMemberType getType() {
    return type;
  }

  public void setType(ChatGroupMemberType type) {
    this.type = type;
  }
}
