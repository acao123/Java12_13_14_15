package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @class: NumberFormatTest.class
 * @description: 压缩格式数据格式化
 * @author: acao
 * @create: 2020-11-23 14:20
 **/
public class NumberFormatTest {

    @Test
    public void test1() {
        var cnf = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1_0000));
        System.out.println(cnf.format(1_9200));
        System.out.println(cnf.format(1_000_000));
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1L << 50));
    }
}
