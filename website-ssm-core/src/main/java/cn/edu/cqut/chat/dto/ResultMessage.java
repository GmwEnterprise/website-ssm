package cn.edu.cqut.chat.dto;

import java.util.HashMap;
import java.util.Map;

public final class DefaultResultSet {

  public static <E> Map<String, E> initResultMap() {
    Map<String, E> map = new HashMap<>();
    map.put("Writer", null);
    return map;
  }
}
