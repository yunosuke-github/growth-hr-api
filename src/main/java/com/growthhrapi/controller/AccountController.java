package com.growthhrapi.controller;

import com.growthhrapi.request.Request;
import com.growthhrapi.response.Response;
import com.growthhrapi.selector.AccountSelector;
import com.growthhrapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account/")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public Response get(@RequestBody Request<AccountSelector> request) {
        return accountService.get(request);
    }

}
