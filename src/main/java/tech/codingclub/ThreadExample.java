package tech.codingclub;

import java.util.Scanner;

public class ThreadExample extends  Thread{
    public String threadName;
    public int counter;
    private int wtime;
    public  ThreadExample(String threadName,int counter,int wtime){
        this.threadName=threadName;
        this.counter=counter;
        this.wtime=wtime;
    }
    public void run(){

       while (counter<1000){
           counter++;
           try {
                   Thread.sleep(wtime);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           System.out.println(threadName+":"+counter);
       }
    }

    public static void main(String[] args) {
        ThreadExample thread1=new ThreadExample("thread1",100,200);
        ThreadExample thread2=new ThreadExample("thread2",200,500);
        ThreadExample thread3=new ThreadExample("thread3",0,1000);
        thread1.start();
        thread2.start();
        thread3.start();
        Scanner scan=new Scanner(System.in);

        System.out.println(thread1.counter);
        System.out.println(thread2.counter);
        System.out.println(thread3.counter);
    }
}
