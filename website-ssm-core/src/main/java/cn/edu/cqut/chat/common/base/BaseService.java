package cn.edu.cqut.chat.common.base;

import java.util.List;

/**
 * Service接口继承该接口，实现类继承BaseServiceImpl就可以使用默认的查看、删除功能
 * @see BaseServiceImpl
 * @param <Entity>
 */
public interface BaseService<Entity> {

  Entity get(Entity entity);

  Entity get(Long id);

  List<Entity> getList(Entity entity);

  int remove(Entity entity);

  int remove(Long id);
}
