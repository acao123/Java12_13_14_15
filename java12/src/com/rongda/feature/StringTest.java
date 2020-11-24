package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @class: StringTest.class
 * @description:
 * @author: acao
 * @create: 2020-11-23 14:22
 **/
public class StringTest {

    @Test
    public void testTransform() {
        String result = "Hello".transform(str -> str + " world!");

        System.out.println(result);
    }

    @Test
    public void testTransform1() {
        var info1 = "hello".transform(info -> info + "world ").transform(String::toUpperCase).transform(String::trim);
        System.out.println(info1);
    }

    @Test
    public void testTransform2() {
        System.out.println("======test java 12 transform======");
        List<String> list1 = List.of("Java", " Python", " C++ ");
        List<String> list2 = new ArrayList<>();
        list1.forEach(element -> list2.add(element.transform(String::strip)
                .transform(String::toUpperCase)
                .transform(e -> "Hi," + e))
        );
        list2.forEach(System.out::println);
    }

    @Test
    public void testTransform3() {
        List<String> list1 = List.of("Java", " Python", " C++ ");
        List<String> resultList = list1.stream()
                .map(String::toLowerCase)
                .map(el -> "Hi," + el)
                .collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }

    /**
     * 缩进 int n 个字符
     */
    @Test
    public void testIndent() {
        System.out.println("======test java 12 indent======");
        String result = "Java\n Python\nC++".indent(3);
        System.out.println(result);
    }
}
