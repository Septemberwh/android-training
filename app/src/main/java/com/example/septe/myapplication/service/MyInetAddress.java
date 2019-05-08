package com.example.septe.myapplication.service;

import java.net.InetAddress;
import java.util.Arrays;

public class MyInetAddress {

    public static void main(String[] args) throws Exception{
        // 获取本机InetAddress的实例
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("本机名：" + address.getHostName());
        System.out.println("IP地址：" + address.getHostAddress());
        byte[] bytes = address.getAddress();
        System.out.println("字节数组形式的IP的地址：" + Arrays.toString(bytes));
        System.out.println("直接输出InetAddress对象：" + address);
    }
}
