package cn.edu.cqut.chat.common.base;

import java.util.List;

/**
 * Service接口继承该接口，实现类继承BaseServiceImpl就可以使用默认的增删改查功能
 * @see BaseServiceImpl
 * @param <Entity>
 */
public interface BaseService<Entity> {

  Entity get(Entity entity);

  Entity get(Long id);

  List<Entity> getList(Entity entity);

  void remove(Entity entity);

  void remove(Long id);

  void save(Entity entity);
}
