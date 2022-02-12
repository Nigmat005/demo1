package com.example.demo1;

public class Test extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            Thread t1 =new Thread("This is first Thread");
            System.out.println(t1.getName());
            System.out.println("Count1 is: "+i);
        }

        for(int i=1;i<=100;i++){
            Thread t2 =new Thread("This is second Thread");
            System.out.println(t2.getName());
            System.out.println("Count2 is: "+i);
        }
    }
    public static void main(String[] args) {
//              Thread t1 =new Thread("This is first Thread");
//              Thread t2 =new Thread("This is second Thread");

        Test test1 =new Test();
        Test test2 =new Test();
        test1.start();
        test2.start();

    }
}
