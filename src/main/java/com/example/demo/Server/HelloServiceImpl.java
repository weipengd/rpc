package com.example.demo.Server;

public class HelloServiceImpl implements HelloService {
 
    public String sayHi(String name) {
        return "Hi, " + name;
    }
 
}