package com.rongda.feature;

import java.util.Optional;

/**
 * @class: StringConstantTest.class
 * @description:
 * @author: acao
 * @create: 2020-11-23 14:15
 **/
public class StringConstantTest {

    public static void testDescribeConstable() {
        String str = "acao is s good boy!";
        Optional<String> optionalS = str.describeConstable();

        System.out.println(optionalS.get());
    }

    public static void main(String[] args) {
        testDescribeConstable();
    }
}
