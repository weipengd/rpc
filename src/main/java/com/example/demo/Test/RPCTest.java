package com.example.demo.Test;

import com.example.demo.Server.HelloService;
import com.example.demo.Server.HelloServiceImpl;
import com.example.demo.Server.Server;
import com.example.demo.Server.ServiceCenter;

import java.io.IOException;

public class RPCTest {
 
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}