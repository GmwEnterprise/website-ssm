package cn.edu.cqut.chat.util;

import java.nio.charset.Charset;

public final class StringUtil {

  public final static String defaultCharset = "UTF-8";

  public static boolean isNotEmpty(String string) {
    return string != null && !string.equals("");
  }

  public static boolean isNotBlank(String string) {
    return isNotEmpty(string) && string.trim().length() > 0;
  }
}
