package com.growthhrapi.service;

import com.growthhrapi.request.Request;
import com.growthhrapi.response.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
abstract class ServiceBase<R, S> {

    protected Response<R> createResponse(R result) {
        Response<R> response = new Response<R>();
        response.setStatus(200);
        response.setResult(result);
        return response;
    }

    abstract Response<R> get(Request<S> request);

    // TODO: validate
    protected void validate() {}

}
