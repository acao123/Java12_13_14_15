package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: Feature04.class
 * @description: switch 表达式转正
 * @author: acao
 * @create: 2020-11-23 19:41
 **/
public class Feature04 {

    @Test
    public void test4(){
        String x = "3";
        int num = switch (x){
            case "1":yield 1;
            case "2":yield 2;
            case "3":yield 3;
            default: yield 4;
        };
        System.out.println(num);
    }

}
