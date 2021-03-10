package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < Country.values().length; i++) {
            System.out.println(Country.values()[i]);
        }
        getCountry();

    }


    public static void getCountry() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try {
            Country output = Country.valueOf(str);
            System.out.println("Страна " + output + " " + output.getIsOpen());
        } catch (NullPointerException e) {
            System.out.println("Неккоректный ввод");
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
            try {
                Country output = Country.getByRuName(str);
                System.out.println("Страна " + output + " " + output.getIsOpen());
            } catch (NoSuchCountryException e1) {
                System.out.println("Страны " + str + " не существует");
            }
        }
    }

}

