package com.demo.section7;

/**
 * Created by DELL on 28-Jan-16.
 */
public class Country {
    private String name;
    private int flagId;

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(String name, int flagId) {

        this.name = name;
        this.flagId = flagId;
    }
}
