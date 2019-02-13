package cn.edu.cqut.chat.service.impl;

import cn.edu.cqut.chat.common.base.BaseServiceImpl;
import cn.edu.cqut.chat.entity.Account;
import cn.edu.cqut.chat.mapper.AccountMapper;
import cn.edu.cqut.chat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl
    extends BaseServiceImpl<Account, AccountMapper>
    implements AccountService {

  @Autowired
  public AccountServiceImpl(AccountMapper mapper) {
    super(mapper);
  }
}
