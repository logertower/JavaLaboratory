package com.liutf.demo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ltf
 * @create 2018-07-09 下午 09:56
 */
public class Test {


    public static void main(String[] args) {
        while (true) {
            List<Custosmer> clist = new ArrayList<Custosmer>();
            for (int i = 0; i < 50000000; i++) {
                Custosmer c = new Custosmer();
                c.setAge(11);
                c.setEmail("logertower@173.com");
                c.setName("name");
                c.setSex(11);
                clist.add(c);
                System.out.println(i);
            }
        }
    }

}
