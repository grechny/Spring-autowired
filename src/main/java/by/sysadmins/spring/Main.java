package by.sysadmins.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.sysadmins.spring.bean.Bean;
import by.sysadmins.spring.nonbean.NonBean;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello world");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Bean bean = context.getBean("bean", Bean.class);
        bean.print();

        // Variant 1
        //NonBean nonBean = context.getBean("nonBean", NonBean.class);
        //nonBean.print();

        // Variant 2
        //(new NonBean()).print();
    }
}
