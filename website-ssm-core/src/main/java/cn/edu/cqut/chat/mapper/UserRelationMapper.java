package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.common.base.BaseMapper;
import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.enums.RelationType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRelationMapper extends BaseMapper<cn.edu.cqut.chat.entity.UserRelation> {

  List<User> findYourRelation(@Param("user") User user, @Param("type") RelationType type);
}
