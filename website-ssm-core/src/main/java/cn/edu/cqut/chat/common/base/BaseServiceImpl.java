package cn.edu.cqut.chat.common.base;

import cn.edu.cqut.chat.common.exception.CrudException;
import cn.edu.cqut.chat.common.util.StringUtil;
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

  public void remove(Entity entity) {
    remove(entity.getId());
  }

  @Transactional
  public void remove(Long id) {
    mapper.delete(id);
  }

  @Transactional
  public void save(Entity entity) {
    try {
      Date now = new Date();
      entity.setLastModifiedTime(now);
      if (entity.getId() != null) {
        mapper.update(entity);
      } else {
        entity.setCreateTime(now);
        mapper.insert(entity);
      }
    } catch (Exception e) {
      throw new CrudException("保存数据失败：" + e.getMessage());
    }
  }
}
