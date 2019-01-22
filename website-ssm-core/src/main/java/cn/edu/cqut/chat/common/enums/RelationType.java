package cn.edu.cqut.chat.common.enums;

public enum RelationType {

  ATTENTION(1, "关注"), BLACKLIST(2, "拉黑"), NO_RELATION(3, "没有关系");

  int index;
  String name;

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
}
