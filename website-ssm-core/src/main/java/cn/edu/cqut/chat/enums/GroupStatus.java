package cn.edu.cqut.chat.enums;

public enum GroupStatus {

  RUNING(0, "运作中"),
  DISBANDED(1, "已解散");

  private int index;
  private String name;

  GroupStatus(int index, String name) {
    this.index = index;
    this.name = name;
  }

  public static GroupStatus typeOf(int index) {
    for (GroupStatus item : values()) {
      if (item.index == index) {
        return item;
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
