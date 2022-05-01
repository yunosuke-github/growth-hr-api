package com.growthhrapi.request;

import lombok.Data;

@Data
public class Request<S> {

    public S selector;

}
