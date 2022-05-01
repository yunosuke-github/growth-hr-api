package com.growthhrapi.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaoBase<T, S> {

    List<T> get(S selector);

}
