package cn.edu.cqut.chat.enums;

public enum UserGroupStatus {

  RUNING(0, "运作中"),
  DISBANDED(1, "已解散");

  private int index;
  private String name;

  UserGroupStatus(int index, String name) {
    this.index = index;
    this.name = name;
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
