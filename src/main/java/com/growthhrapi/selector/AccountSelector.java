package com.growthhrapi.selector;

import lombok.Data;

import java.util.List;

@Data
public class AccountSelector {

    public Long id;

    public List<Long> ids;

    public List<Query> queries;

}
