package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * StartEventHandler implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event){
        System.out.println("We've received ContextStartEvent...");
    }
}
