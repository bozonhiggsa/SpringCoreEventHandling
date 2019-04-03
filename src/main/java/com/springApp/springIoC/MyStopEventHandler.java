package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * StopEventHandler implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("We've received ContextStoppedEvent...");
    }
}
