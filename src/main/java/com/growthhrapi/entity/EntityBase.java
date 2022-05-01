package com.growthhrapi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class EntityBase {

    public Integer deleted;

    public Date createdAt;

    public String createdBy;

    public Date updatedAt;

    public String updatedBy;

}
