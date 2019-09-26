package com.example;

import com.example.impl.Stage;
import com.example.inerf.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTesting {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights.xml");
        Performer performer = (Performer) applicationContext.getBean("PoeticDuke");
        Stage stage = (Stage) applicationContext.getBean("stage");
        stage.setStage();
        performer.perform();
    }
}
