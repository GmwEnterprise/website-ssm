package cn.edu.cqut.chat.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RelationType {

  ATTENTION(1, "关注"), BLACKLIST(2, "拉黑"), NO_RELATION(3, "没有关系");

  private int index;
  private String name;

  RelationType(int index, String name) {
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

  public static RelationType typeOf(int index) {
    for (RelationType item : values()) {
      if (item.index == index) {
        return item;
      }
    }
    return null;
  }
}
