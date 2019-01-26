package cn.edu.cqut.chat.common.util;

import cn.edu.cqut.chat.common.ClassDetails;

/**
 * 反射工具类
 */
public final class ReflectUtil {

  /**
   * 返回实体的类名，首字母小写
   * @param e 实体对象
   * @return 实体类名，首字母小写
   */
  public static String getEntityName(Object e) {
    String simpleName = e.getClass().getSimpleName();
    return simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
  }

  public static ClassDetails getClassDetailText(Class<?> clazz) {

    return null;
  }
}
