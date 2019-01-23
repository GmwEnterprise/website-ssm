package cn.edu.cqut.chat.dto;

import java.util.HashMap;
import java.util.Map;

public class ModelMap extends DtoFactory {

  Map<String, Object> map;

  ModelMap() {
    this.map = new HashMap<>();
  }

  @Override
  public DtoFactory setData(String key, Object val) {
    map.put(key, val);
    return this;
  }

  @Override
  public Map<String, Object> build() {
    return map;
  }
}
