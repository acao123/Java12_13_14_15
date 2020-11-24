package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: SwitchTest1.class
 * @description: Java12新特性 switch 表达式
 * @author: acao
 * @create: 2020-11-23 13:57
 **/
public class SwitchTest1 {

    @Test
    public void test1() {
        Fruit fruit = Fruit.APPLE;
        switch (fruit) {
            case PEAR -> System.out.println(4);
            case APPLE, GRAPE, MANGO -> System.out.println(5);
            case ORANGE, PAPAYA -> System.out.println(6);
            default -> throw new IllegalStateException("No Such Fruit:" + fruit);
        }
    }

    @Test
    public void test2() {
        int numberOfLetters;
        Fruit fruit = Fruit.APPLE;
        switch (fruit) {
            case PEAR -> numberOfLetters = 4;
            case APPLE, GRAPE, MANGO -> numberOfLetters = 5;
            case ORANGE, PAPAYA -> numberOfLetters = 6;
            default -> throw new IllegalStateException("No Such Fruit:" + fruit);
        }

        System.out.println(numberOfLetters);
    }

}
