package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: Feature01.class
 * @description: JEP 305：instanceof的模式匹配（预览）
 * @author: acao
 * @create: 2020-11-23 15:44
 **/
public class Feature01 {

    @Test
    public void test1() {
        Object obj = "Hello Java14";
        //obj = null;
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.contains("Java"));
        } else {
            System.out.println("非字符串");
        }

        if (obj instanceof String str) {
            System.out.println(str.contains("Java"));
        } else {
            System.out.println("非字符串");
        }

    }

    //举例3：
    class Monitor{
        private String model;
        private double price;

//    public boolean equals(Object o){
//        if(o instanceof Monitor other){
//            if(model.equals(other.model) && price == other.price){
//                return true;
//            }
//        }
//        return false;
//    }


        public boolean equals(Object o){
            return o instanceof Monitor other && model.equals(other.model) && price == other.price;
        }

    }
}
