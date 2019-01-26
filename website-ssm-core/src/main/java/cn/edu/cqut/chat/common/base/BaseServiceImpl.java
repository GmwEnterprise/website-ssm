package cn.edu.cqut.chat.common.base;

import cn.edu.cqut.chat.common.exception.CrudException;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

  /**
   * entity的id若为空则为插入；反之则为更新
   * @param entity 实体
   * @return 实体对应的领域对象
   */
  @Transactional
  public BaseDto<Entity> save(Entity entity) {
    if (entity == null) {
      throw new CrudException("实体为空，保存数据失败！");
    }
    int effect = 0;
    Date now = new Date();
    entity.setLastModifiedTime(now);
    if (entity.getId() != null) {
      effect = mapper.update(entity);
    } else {
      entity.setCreateTime(now);
      effect = mapper.insert(entity);
    }
    if (effect > 0) {
      return new BaseDto<>(entity);
    }
    throw new CrudException("保存数据失败！");
  }
}
