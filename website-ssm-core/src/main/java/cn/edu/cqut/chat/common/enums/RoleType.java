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

  private int typeId;
  private String typeName;

  RoleType(int typeId, String typeName) {
    this.typeId = typeId;
    this.typeName = typeName;
  }

  public int getTypeId() {
    return typeId;
  }

  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public static RoleType typeOf(int typeId) {
    for (RoleType type : values()) {
      if (type.typeId == typeId) {
        return type;
      }
    }
    return null;
  }
}
