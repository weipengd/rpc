package com.example.demo.Test;

import com.example.demo.Client.RPCClient;
import com.example.demo.Server.HelloService;

import java.net.InetSocketAddress;

/**
 * Create by dongweipeng on 2019/3/30
 */
public class TEset {
    public static void main(String[] args) {
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("111"));
    }
}
