package com.elvin.esoftwaricaalias.model.enums;

/**
 * @author Elvin Shrestha on 13/12/19
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
