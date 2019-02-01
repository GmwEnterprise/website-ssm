package cn.edu.cqut.chat.common.base;

import java.util.List;

public interface BaseMapper<Entity extends BaseEntity> {

  Entity queryById(Long id);

  List<Entity> queryAll(Entity entity);

  int insert(Entity entity);

  int update(Entity entity);

  /**
   * 若指定的id不存在于查询的表，则不报错，返回 0
   * @param id 指定的表的主键
   * @return 受影响行数
   */
  int delete(Long id);
}
