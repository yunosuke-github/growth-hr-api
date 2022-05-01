package com.growthhrapi.response;

import lombok.Data;

import java.util.List;

@Data
public class Response<R> {

    public Integer status;

    public R result;

}
