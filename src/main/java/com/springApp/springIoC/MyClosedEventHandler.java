package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * StartEventHandler implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyClosedEventHandler implements ApplicationListener<ContextClosedEvent> {
    public void onApplicationEvent(ContextClosedEvent event){
        System.out.println("We've received ContextClosedEvent...");
    }
}
