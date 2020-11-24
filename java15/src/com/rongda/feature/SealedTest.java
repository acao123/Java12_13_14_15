package com.rongda.feature;

/**
 * @class: SealedTest.class
 * @description:
 * @author: acao
 * @create: 2020-11-23 20:41
 **/
public class SealedTest {

    public static void main(String[] args) {

        String result = getCenter(new Teacher());
        System.out.println(result);
    }

   public static String getCenter(Person person) {
       /* if (person instanceof Teacher) {
            Teacher teacher =  (Teacher)teacher;
            return teacher.teach();
        }*/

       if (person instanceof Teacher teacher) {
           return teacher.teach();
       }
       return null;
    }
}
