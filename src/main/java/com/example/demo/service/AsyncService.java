package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void hello(){
        try {

            Thread.sleep(3000);
            System.out.println("sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
