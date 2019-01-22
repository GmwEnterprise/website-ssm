package cn.edu.cqut.chat.common.enums;

/**
 * 账户角色类型
 */
public enum RoleType {

  /**
   * 超级管理员，全系统只有一个，只能通过开发者自行创建
   */
  ROOT(0, "超级管理员"),

  /**
   * 普通用户，注册本系统即获取该角色类型
   */
  USER(1, "普通用户"),

  /**
   * 后台管理员，可以在管理系统中注册，通过管理系统维护本系统数据
   */
  ADMIN(2, "后台管理员");

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

  /**
   * 通过编号获取角色类型
   *
   * @param index 角色类型编号
   * @return 角色类型
   */
  public static RoleType typeOf(int index) {
    for (RoleType type : values()) {
      if (type.index == index) {
        return type;
      }
    }
    return null;
  }
}
