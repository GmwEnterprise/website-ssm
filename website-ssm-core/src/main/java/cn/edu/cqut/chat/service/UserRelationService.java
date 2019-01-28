package cn.edu.cqut.chat.service;

import cn.edu.cqut.chat.common.base.BaseService;
import cn.edu.cqut.chat.dto.BaseDto;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.entity.UserRelation;
import cn.edu.cqut.chat.enums.RelationType;

public interface UserRelationService extends BaseService<UserRelation> {

  BaseDto<UserRelation> makeRelation(User a, User b, RelationType relationType);
}
