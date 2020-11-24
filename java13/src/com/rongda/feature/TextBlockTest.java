package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: TextBlockTest.class
 * @description: 文本块儿
 * @author: acao
 * @create: 2020-11-23 15:01
 **/
public class TextBlockTest {

    @Test
    public void test1() {
        String html = "<html>\n" +
                "<head>\n" +
                "    <title>User-Sync</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <script type=\"text/javascript\" src=\"usync.js\"></script>\n" +
                "  </script>\n" +
                "</body>\n" +
                "</html>";
        System.out.println(html);
        System.out.println("-------------");

        html = """
                <html>
                <head>
                    <title>User-Sync</title>
                </head>
                <body>
                  <script type="text/javascript" src="usync.js"></script>
                  </script>
                </body>
                </html>
                """;
        System.out.println(html);

    }

    @Test
    public void test2() {
        //注意后面的换行符
        String a = """
                        a                  
                """;
        String b = """
                b""";
        a = a + b;
        System.out.println(a);
    }

    @Test
    public void test3() {
        String source = """
                public void print(%s object) { System.out.println(Objects.toString(object)); }
                """.formatted("type");

        System.out.println(source);
    }


}
