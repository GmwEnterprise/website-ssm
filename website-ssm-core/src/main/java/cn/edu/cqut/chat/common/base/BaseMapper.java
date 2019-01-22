package cn.edu.cqut.chat.common.base;

import java.util.List;

public interface BaseMapper<Entity extends BaseEntity> {

  Entity queryById(Long id);

  List<Entity> queryAll(Entity entity);

  int insert(Entity entity);

  int update(Entity entity);

  int delete(Long id);
}
