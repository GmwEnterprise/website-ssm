package cn.edu.cqut.chat.common.util;

/**
 * 反射工具类
 */
public class ReflectUtil {

  /**
   * 返回实体的类名，首字母小写
   * @param e 实体对象
   * @param <E> 实体类型
   * @return 实体类名，首字母小写
   */
  public static <E> String getEntityName(E e) {
    String simpleName = e.getClass().getSimpleName();
    return simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
  }
}
