package com.growthhrapi.entity;

import lombok.Data;

@Data
public class Account extends EntityBase {

    public Long accountId;

    public String accountName;

    public String accountCode;

    public String email;

    public String password;

}
