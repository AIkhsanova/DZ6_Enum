package com.company;

import java.util.NoSuchElementException;

public enum Country {
    Russia("Россия", true),
    USA("Америка", true),
    Italy("Италия", false);

    private final String ruName;
    private final boolean isOpen;


    Country(String ruName, boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return this.name() +
                '(' + ruName +
                ')';
    }

    public static Country getByRuName(String country) throws NoSuchCountryException {

        for (int i = 0; i < Country.values().length; i++) {
            if (country.equals(Country.values()[i].ruName)) {
                return Country.values()[i];
            }
        }

        throw new NoSuchCountryException(country);

    }

    public String getIsOpen() {
        if (this.isOpen) {
            return "открыта для посещения";
        } else {
            return "закрыта для посещения";
        }
    }

}
