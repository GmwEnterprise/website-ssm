package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.common.base.BaseServiceImpl;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.mapper.UserRelationMapper;
import cn.edu.cqut.chat.service.UserRelationService;
import org.springframework.stereotype.Service;

@Service
public class UserRelationServiceImpl
    extends BaseServiceImpl<UserRelation, UserRelationMapper>
    implements UserRelationService {

  public UserRelationServiceImpl(UserRelationMapper mapper) {
    super(mapper);
  }
}
