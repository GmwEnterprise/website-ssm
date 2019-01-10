package cn.edu.cqut.chat.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认success = true
 * @param <E>
 */
public final class ResultMessage<E> {

  private Map<String, E> data;
  private String remark; // 备注
  private boolean success; // 请求状态，成功/失败

  public ResultMessage() {
    success = true;
    remark = "Created by GmwEnterprise";
    data = new HashMap<>();
  }

  public void put(String key, E val) {
    data.put(key, val);
  }

  public E key(String key) {
    return data.get(key);
  }

  public void delete(String key) {
    data.remove(key);
  }

  public Map<String, E> getData() {
    return data;
  }

  public void setData(Map<String, E> data) {
    this.data = data;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }
}
