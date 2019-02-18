package cn.edu.cqut.chat.enums;

public enum ChatGroupMemberType {

  CREATOR(1, "群主"), ADMINISTRATOR(2, "群管理员"), MEMBER(3, "群成员");

  private int index;
  private String name;

  ChatGroupMemberType(int index, String name) {
    this.index = index;
    this.name = name;
  }

  public static ChatGroupMemberType typeOf(int index) {
    for (ChatGroupMemberType value : values()) {
      if (value.index == index) {
        return value;
      }
    }
    return null;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
