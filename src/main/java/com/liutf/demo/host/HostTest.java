package com.liutf.demo.host;

import java.net.InetAddress;

/**
 * 网络
 *
 * @author ltf
 * @create 2018-11-28 12:31 PM
 */
public class HostTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InetAddress ia = null;
        try {
            ia = ia.getLocalHost();

            String localname = ia.getHostName();
            String localip = ia.getHostAddress();
            System.out.println("本机名称是：" + localname);
            System.out.println("本机的ip是 ：" + localip);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
