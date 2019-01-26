package cn.edu.cqut.chat.common;

import java.lang.reflect.Field;

public class ClassDetails<E> {

  private Class<E> clazz;

  public ClassDetails(Class<E> clazz) {
    this.clazz = clazz;
  }

  public void print() {
    StringBuilder builder = new StringBuilder();
    builder.append("package ").append(this.clazz.getPackage()).append(";");
    // 打印成员变量
    Field[] declaredFields = this.clazz.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      builder.append(declaredField);
    }
    // 打印方法


    System.out.println(builder.toString());
  }
}
