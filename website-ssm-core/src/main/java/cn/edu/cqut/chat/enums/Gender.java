package cn.edu.cqut.chat.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Gender {

  MALE(1, "男"), FEMALE(2, "女"), SECRET(3, "保密");

  private int index;
  private String name;

  Gender(int index, String name) {
    this.name = name;
    this.index = index;
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

  public static Gender typeOf(int index) {
    for (Gender item : values()) {
      if (item.index == index) {
        return item;
      }
    }
    return null;
  }
}
