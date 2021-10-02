package tech.codingclub;

import java.util.Scanner;

public class RunnableExample implements Runnable{
    public String threadName;
    public int counter;
    private int wtime;
    public RunnableExample(String threadName, int counter, int wtime){
        this.threadName=threadName;
        this.counter=counter;
        this.wtime=wtime;
    }
    public void run(){

       while (counter<100){
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
        RunnableExample runnable1=new RunnableExample("thread1",100,200);
        RunnableExample runnable2=new RunnableExample("thread2",200,500);
        RunnableExample runnable3=new RunnableExample("thread3",0,1000);
        Scanner scan=new Scanner(System.in);
        Thread thread1= new Thread(runnable1);
        Thread thread2= new Thread(runnable2);
        Thread thread3= new Thread(runnable3);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(runnable1.counter);
        System.out.println(runnable2.counter);
        System.out.println(runnable3.counter);
    }
}
