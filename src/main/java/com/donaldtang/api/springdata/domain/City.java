package com.donaldtang.api.springdata.domain;

import lombok.Data;

@Data
public class City {

    private Long id;
    private String name;
    private String state;
    private String country;


    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getState() + "," + getCountry();
    }

}