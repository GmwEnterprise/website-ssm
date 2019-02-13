package cn.edu.cqut.chat.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * 字符串工具类
 *
 * @author GmwEnterprise
 * @see String
 */
public final class StringUtil {

  private static final Random RAND = new Random();

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

  /**
   * 提供一个指定长度的随机字符串，由字母和数字构成
   *
   * @param size 指定长度
   * @return 生成好的字符串
   */
  public static String randomUID(int size) {
    // 48-57 ~ 0-9, 65-90 ~ A-Z, 97-122 ~ a-z
    StringBuilder str = new StringBuilder();
    while (str.length() < size) {
      switch (RAND.nextInt(3)) {
        case 0:
          str.append(RAND.nextInt(10));
          break;
        case 1:
          str.append((char)(65 + RAND.nextInt(26)));
          break;
        case 2:
          str.append((char)(97 + RAND.nextInt(26)));
          break;
      }
    }
    return str.toString();
  }
}
