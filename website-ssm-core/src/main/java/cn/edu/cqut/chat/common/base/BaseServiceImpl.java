package cn.edu.cqut.chat.common.base;

import java.util.List;

public class BaseServiceImpl<Entity extends BaseEntity, Mapper extends BaseMapper<Entity>> {

  protected Mapper mapper;

  public BaseServiceImpl(Mapper mapper) {
    this.mapper = mapper;
  }

  public Entity get(Entity entity) {
    return mapper.queryById(entity.getId());
  }

  public Entity get(Long id) {
    return mapper.queryById(id);
  }

  public List<Entity> getList(Entity entity) {
    return mapper.queryAll(entity);
  }

  public int remove(Entity entity) {
    return mapper.delete(entity.getId());
  }

  public int remove(Long id) {
    return mapper.delete(id);
  }
}
