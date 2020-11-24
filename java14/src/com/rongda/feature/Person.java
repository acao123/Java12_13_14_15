package com.rongda.feature;

public record Person(String name, int age) {

    public Person() {
        this(null, 0);
    }

    public Person(String name) {
        this(name, 0);
    }

    public static String nation;

    public static String showNation() {
        return nation;
    }

    public String getNameInUpperCase(){
        return name.toUpperCase();
    }

}
