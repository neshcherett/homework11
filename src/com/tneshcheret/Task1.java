package com.tneshcheret;

import java.util.Random;

public class Task1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
      /* Задание 1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
             Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
             Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
         Задание 1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
             не было человека весом 3 кг и ростом 180 итд.
      */
        Person[] groupPeople = new Person[100];
        createRandomGroupPersons(groupPeople);
    }

    private static void createRandomGroupPersons(Person[] groupPerson) {
        for (int i = 0; i < groupPerson.length; i++) {
            int age = age();
            groupPerson[i] = new Person(getName(), getSurname(), age, weight(age), height(age));
            System.out.println(groupPerson[i]);
        }
    }

    private static int gender() {
        return random.nextInt(2);
    }

    private static String getName() {
        if (gender() == 0) {
            return getMenName();
        } else {
            return getWomanName();
        }
    }

    private static String getMenName() {
        String[] manNames = {"Alex", "Ben", "Bob", "Ross", "Chandler", "Joey", "Jack", "Jonah"};
        int randomManName = random.nextInt(8);
        return manNames[randomManName];
    }

    private static String getWomanName() {
        String[] womanNames = {"Sarah", "Lily", "Monica", "Phoebe", "Rachel", "Lisa", "Karen", "Jennifer"};
        int randomManName = random.nextInt(8);
        return womanNames[randomManName];
    }

    private static String getSurname() {
        String[] surnames = {"Geller", "Farber", "Tribbiani", "Ramoray", "Green", "Perry", "Buffay", "Bing"};
        int randomSurname = random.nextInt(8);
        return surnames[randomSurname];
    }

    private static int age() {
        return random.nextInt(100);
    }

    private static int weight(int age) {
        if (age <= 2) {
            return random.nextInt(3) + 9;
        } else {
            if (age <= 4) {
                return random.nextInt(7) + 13;
            } else {
                if (age <= 8) {
                    return random.nextInt(12) + 18;
                } else {
                    if (age <= 13) {
                        return random.nextInt(20) + 25;
                    } else {
                        return random.nextInt(60) + 40;
                    }
                }
            }
        }
    }

    private static double height(int age) {
        if (age <= 2) {
            return random.nextInt(30) / 100.0 + 0.4;
        } else {
            if (age <= 4) {
                return random.nextInt(30) / 100.0 + 0.6;
            } else {
                if (age <= 8) {
                    return random.nextInt(20) / 100.0 + 1;
                } else {
                    if (age <= 13) {
                        return random.nextInt(40) / 100.0 + 1.2;
                    } else {
                        return random.nextInt(50) / 100.0 + 1.5;
                    }
                }
            }
        }
    }
}
