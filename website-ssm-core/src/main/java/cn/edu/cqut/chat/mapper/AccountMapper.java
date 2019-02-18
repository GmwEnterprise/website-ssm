package cn.edu.cqut.chat.mapper;

import cn.edu.cqut.chat.common.annotation.Mapper;
import cn.edu.cqut.chat.entity.Account;

import java.util.List;

@Mapper
public interface AccountMapper {

  Account queryOne(Long id);

  List<Account> queryAll(Account account);

  int insert(Account account);

  int update(Account account);

  int delete(Long id);
}
