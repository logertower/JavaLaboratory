package com.liutf.demo.thread;

/**
 * java多线程测试类
 */
public class ThreadTest {

    /**
     * Java中线程的创建常见有如三种基本形式
     */
    public static void newThread() {

        /**
         * 1.继承Thread类，重写该类的run()方法。
         */
        MyThread myThread = new MyThread();
        myThread.start();

        /**
         * 2.实现Runnable接口，并重写该接口的run()方法，该run()方法同样是线程执行体，创建Runnable实现类的实例，并以此实例作为Thread类的target来创建Thread对象，该Thread对象才是真正的线程对象。
         */
        MyRunable myRunable = new MyRunable();

        Thread thread1 = new Thread(myRunable);
        thread1.start();
        

    }


    public static void main(String[] args) {
        newThread();
    }


}


class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread run...");
    }

}


class MyRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable run...");
    }
}