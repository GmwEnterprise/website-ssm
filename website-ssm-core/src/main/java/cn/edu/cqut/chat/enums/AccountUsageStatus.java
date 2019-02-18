package cn.edu.cqut.chat.enums;

public enum AccountUsageStatus {

  USING(1, "使用中"), BLOCK_UP(2, "停用"), CANCELLED(3, "已注销");

  private int index;
  private String name;

  AccountUsageStatus(int index, String name) {
    this.index = index;
    this.name = name;
  }

  public static AccountUsageStatus typeOf(int index) {
    for (AccountUsageStatus value : values()) {
      if (index == value.index) {
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
