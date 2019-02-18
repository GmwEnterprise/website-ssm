package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.entity.SocialRelation;

import java.util.List;

@Mapper
public interface SocialRelationMapper {

  List<SocialRelation> queryAll(SocialRelation socialRelation);

  int insert(SocialRelation socialRelation);

  int update(SocialRelation socialRelation);

  int delete(Long id);
}
