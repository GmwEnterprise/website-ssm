package cn.edu.cqut.chat.common.util;

import cn.edu.cqut.chat.common.base.BaseEntity;

/**
 * 实体工具类
 */
public final class EntityUtil {

  public static <Entity extends BaseEntity> boolean idIsNotEmpty(Entity entity) {
    return entity != null && entity.getId() != null;
  }
}
