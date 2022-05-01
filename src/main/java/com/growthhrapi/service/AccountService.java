package com.growthhrapi.service;

import com.growthhrapi.dao.AccountDao;
import com.growthhrapi.entity.Account;
import com.growthhrapi.request.Request;
import com.growthhrapi.response.AccountServiceResponse;
import com.growthhrapi.response.Response;
import com.growthhrapi.selector.AccountSelector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends ServiceBase<AccountServiceResponse, AccountSelector> {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Response<AccountServiceResponse> get(Request<AccountSelector> request) {
        List<Account> accounts = accountDao.get(request.getSelector());
        AccountServiceResponse response = new AccountServiceResponse();
        response.setAccounts(accounts);
        return createResponse(response);
    }

}
