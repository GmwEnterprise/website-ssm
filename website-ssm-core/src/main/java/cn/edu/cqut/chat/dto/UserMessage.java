package cn.edu.cqut.chat.dto;

import cn.edu.cqut.chat.entity.User;
import cn.edu.cqut.chat.enums.RelationType;

import java.util.List;
import java.util.Map;

public class UserMessage {

  private User self;
  private Map<RelationType, List<User>> relationMap;
}
