package cn.edu.cqut.chat.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RelationType {

  ADD_FRIEND(1, "添加对方为好友"), BLACK_LIST(2, "加入黑名单");

  private int index;
  private String name;

  RelationType(int index, String name) {
    this.index = index;
    this.name = name;
  }

  public static RelationType typeOf(int index) {
    for (RelationType item : values()) {
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
