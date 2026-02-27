package com.nompilo.string_conversion_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringRequest {

    @JsonProperty("data")
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
