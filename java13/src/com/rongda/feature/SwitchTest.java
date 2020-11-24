package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: AwitchTest.class
 * @description: java13增强 增加yield 关键字
 * @author: acao
 * @create: 2020-11-23 14:59
 **/
public class SwitchTest {

    @Test
    public void testSwitch3(){
        String x = "3";
        int i = switch(x){
            case "1" : yield 5;
            case "2" : yield 6;
            default : yield 7;
        };
        System.out.println(i);
    }
}
