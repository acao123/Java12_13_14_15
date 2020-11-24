package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @class: Feature03.class
 * @description: Record语法
 * @author: acao
 * @create: 2020-11-23 19:20
 **/
public class Feature03 {

    @Test
    public void test1() {
        Person person1 = new Person("Tom", 18);
        Person person2 = new Person("Tom", 18);

        System.out.println(person1);
        System.out.println(person1.equals(person2));


        //测试hashCode()和equals()
        HashSet<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);

        for (Person person : set) {
            System.out.println(person);
        }

        //测试getter 方法
        System.out.println(person1.age());
        System.out.println(person1.name());

    }

    @Test
    public void test2() {
        Person person1 = new Person("Tom");
        System.out.println(person1.getNameInUpperCase());

        Person.nation = "CHN";
        System.out.println(Person.showNation());
    }

}
