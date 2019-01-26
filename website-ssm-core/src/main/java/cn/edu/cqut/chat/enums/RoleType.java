package cn.edu.cqut.chat.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RoleType {

  ROOT(0, "超级管理员"), USER(1, "普通用户"), ADMIN(2, "后台管理员");

  private int index;
  private String name;

  RoleType(int index, String name) {
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

  public static RoleType typeOf(int index) {
    for (RoleType type : values()) {
      if (type.index == index) {
        return type;
      }
    }
    return null;
  }
}
