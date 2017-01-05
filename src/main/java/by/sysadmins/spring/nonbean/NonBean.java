package by.sysadmins.spring.nonbean;

import org.springframework.beans.factory.annotation.Autowired;

import by.sysadmins.spring.bean.Bean;

public class NonBean {

    @Autowired
    private Bean bean;

    public void print() {
        bean.print();
    }
}
