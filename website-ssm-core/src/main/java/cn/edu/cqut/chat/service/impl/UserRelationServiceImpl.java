package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.common.base.BaseServiceImpl;
import cn.edu.cqut.chat.common.exception.CrudException;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.mapper.UserRelationMapper;
import cn.edu.cqut.chat.service.UserRelationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRelationServiceImpl
    extends BaseServiceImpl<UserRelation, UserRelationMapper>
    implements UserRelationService {

  public UserRelationServiceImpl(UserRelationMapper mapper) {
    super(mapper);
  }

  @Override
  public BaseDto<UserRelation> save(UserRelation entity) {
    if (entity != null) {
      if (entity.getId() == null) {
        // 新插入用户关系
        UserRelation condition = new UserRelation();
        condition.setUserA(entity.getUserA());
        condition.setUserB(entity.getUserB());
        List<UserRelation> relations = mapper.queryAll(condition);
        if (relations != null && relations.size() > 0) {
          entity.setId(relations.get(0).getId());
        }
      }
      return super.save(entity);
    } else {
      throw new CrudException("实体为空，保存数据失败！");
    }
  }
}
