package cn.edu.cqut.chat.common.base;

import cn.edu.cqut.chat.dto.BaseDto;

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

  int remove(Entity entity);

  int remove(Long id);

  BaseDto<Entity> save(Entity entity);
}
