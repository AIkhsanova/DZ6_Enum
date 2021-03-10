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
                '{' + ruName +
                '}';
    }

    public static Country getByRuName(String country) throws NoSuchCountryException {
        if(country==Country.Russia.ruName){
            return Country.Russia;
        }
        else if(country==Country.USA.ruName){
            return Country.USA;
        }
        else if(country==Country.Italy.ruName){
            return Country.Italy;
        }
        else {
            throw new NoSuchCountryException(country);
        }
    }
}
