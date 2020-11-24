package com.rongda.feature;


/**
 * @class: Person.class
 * @description: JEP 360:Sealed Classes(Preview)密封的类和接口（预览）
 * 1、私密类必须是在同一个模块儿或者同一个包下
 * 2、当允许的子类的大小和数量较小时，在与密封的类相同的源文件中声明它们可能会很方便。
 * 当以这种方式声明它们时，sealed该类可以省略该permits子句
 * 3、不能用installof旧语法
 *
 *
 *
 * @author: acao
 * @create: 2020-11-23 20:05
 **/
public sealed class Person /*permits Doctor*/ permits Teacher, Student, Worker, Doctor {

    public void sayHello() {
        System.out.println("say hello");
    }

}

final class Teacher extends Person {
    public String teach() {
        return "Teacher";
    }
}

sealed class Student extends Person permits MiddleSchoolStudent, GraduateStudent {

}

final class MiddleSchoolStudent extends Student {
}  //中学生

final class GraduateStudent extends Student {
}  //研究生

non-sealed class Worker extends Person {
}  //工人

class RailWayWorker extends Worker {
} //铁路工人

//class Doctor extends Person{}


