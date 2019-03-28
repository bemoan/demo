package com.xry.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务案例
 * markhu
 */
@Component
public class DemoTask {
    private  int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private  void  print(){
        System.out.println(count++);
    }
}