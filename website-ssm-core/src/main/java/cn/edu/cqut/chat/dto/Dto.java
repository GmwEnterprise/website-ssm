package cn.edu.cqut.chat.dto;

import java.util.Map;

public abstract class Dto {

  public abstract Dto setData(String key, Object val);

  public abstract Map<String, Object> build();

  public static Dto success(String msg) {
    ModelMap model = new ModelMap();
    model.setData("success", true);
    model.setData("message", msg);
    return model;
  }

  public static Map<String, Object> error(String msg) {
    ModelMap model = new ModelMap();
    model.setData("success", false);
    model.setData("message", msg);
    return model.map;
  }
}
