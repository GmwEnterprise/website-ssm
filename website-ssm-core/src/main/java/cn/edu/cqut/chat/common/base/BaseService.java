package cn.edu.cqut.chat.common.base;

import java.util.List;

public interface BaseService<Entity> {

  Entity get(Entity entity);

  Entity get(Long id);

  List<Entity> getList(Entity entity);

  int remove(Entity entity);

  int remove(Long id);
}
