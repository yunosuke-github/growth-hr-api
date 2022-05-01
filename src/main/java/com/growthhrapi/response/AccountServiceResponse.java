package com.growthhrapi.response;

import com.growthhrapi.entity.Account;
import lombok.Data;

import java.util.List;

@Data
public class AccountServiceResponse {

    public List<Account> accounts;

}
