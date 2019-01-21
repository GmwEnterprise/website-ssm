package cn.edu.cqut.chat.common.util;

/**
 * 字符串工具类
 *
 * @author GmwEnterprise
 * @see String
 */
public final class StringUtil {

  /**
   * 本系统后台程序默认字符类型
   */
  public final static String DEFAULT_CHARSET = "UTF-8";

  /**
   * 判断字符串是否为空字符串
   *
   * @param string 被判断的字符串
   * @return 不为空则返回true
   */
  public static boolean isNotBlank(String string) {
    return string != null && !"".equals(string) && string.trim().length() > 0;
  }
}
