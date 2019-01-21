package cn.edu.cqut.chat.common.base;

import java.util.Date;

/**
 * Entity层必备属性，新建Entity层需继承该基类
 */
public class BaseEntity {

  /**
   * 表自增主键
   */
  private Long id;

  /**
   * 本条记录创建时间
   */
  private Date createTime;

  /**
   * 本条记录最后一次修改时间
   */
  private Date lastModifiedTime;

  /**
   * 备注
   */
  private String remark;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
