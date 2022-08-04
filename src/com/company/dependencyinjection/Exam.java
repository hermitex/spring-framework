package com.company.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student mairura = context.getBean("mairura", Student.class);
        mairura.displayStudentInfo();

        Student tiberius = context.getBean("tiberius", Student.class);
        tiberius.displayStudentInfo();
    }
}
