package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * RefreshEventHandler implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    public void onApplicationEvent(ContextRefreshedEvent event){
        System.out.println("We've received ContextRefreshedEvent...");
    }
}
