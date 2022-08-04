package com.company.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Sim sim = context.getBean("sim", Sim.class);
       sim.data();
       sim.calling();
    }
}
