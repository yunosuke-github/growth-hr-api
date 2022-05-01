package com.growthhrapi.enums;

public enum QueryField {

    ACCOUNT_ID("ACCOUNT_ID"),
    ACCOUNT_NAME("ACCOUNT_NAME");

    private String name;

    private QueryField(String name) {
        this.name = name;
    }

}
