package com.growthhrapi.dao;

import com.growthhrapi.dao.DaoBase;
import com.growthhrapi.entity.Account;
import com.growthhrapi.selector.AccountSelector;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountDao extends DaoBase<Account, AccountSelector> {

    List<Account> get(AccountSelector selector);

}
