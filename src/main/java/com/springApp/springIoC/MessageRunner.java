package com.springApp.springIoC;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MessageRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("message-event-handling-config.xml");
        context.start();
        Message message = (Message) context.getBean("message");
        System.out.println(message);
        context.stop();
    }
}
