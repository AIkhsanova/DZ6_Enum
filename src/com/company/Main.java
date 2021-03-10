package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < Country.values().length; i++) {
            System.out.println(Country.values()[i]);
        }
        System.out.println(Arrays.toString(Country.values()));
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Country country = Country.Russia;


        try {
            System.out.println(Country.getByRuName("123"));
        } catch (NoSuchCountryException e) {
            System.out.println("Страны " + "123" + " не существует");
        }
    }
}

