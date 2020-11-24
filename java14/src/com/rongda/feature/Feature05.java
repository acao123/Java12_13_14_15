package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: Feature05.class
 * @description: 文本块 增强
 * @author: acao
 * @create: 2020-11-23 19:43
 **/
public class Feature05 {

    @Test
    public void test1(){
        String text1 = "The Sound of silence\n" +
                "Hello darkness, my old friend\n" +
                "I've come to talk with you again\n" +
                "Because a vision softly creeping\n" +
                "Left its seeds while I was sleeping\n" +
                "And the vision that was planted in my brain\n" +
                "Still remains\n" +
                "Within the sound of silence";

        System.out.println(text1);

        //jdk13中的新特性：
        String text2 = """
                The Sound of silence
                Hello darkness, my old friend
                I've come to talk with you again
                Because a vision softly creeping
                Left its seeds while I was sleeping
                And the vision that was planted in my brain
                Still remains
                Within the sound of silence
                """;
        System.out.println();
        System.out.println(text2);

        System.out.println(text1.length());
        System.out.println(text2.length());
    }

    //html
    @Test
    public void test2(){
        String html1 = "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>java14新特性</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <p>hello,atguigu</p>\n" +
                "</body>\n" +
                "</html>";
        //jdk13中的新特性：
        String html2 = """
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>java14新特性</title>
                </head>
                <body>
                    <p>hello,atguigu</p>
                </body>
                </html>
                """;
    }

    //jdk14新特性
    @Test
    public void test5(){
        String sql1 = """
                SELECT id,NAME,email
                FROM customers
                WHERE id > 4
                ORDER BY email DESC
                """;
        System.out.println(sql1);

        // \:取消换行操作
        // \s:表示一个空格
        String sql2 = """
                SELECT id,NAME,email \
                FROM customers\s\
                WHERE id > 4 \
                ORDER BY email DESC
                """;
        System.out.println(sql2);
    }


}
