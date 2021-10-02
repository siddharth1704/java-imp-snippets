package tech.codingclub.utility;

import tech.codingclub.RunnableExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadManager {
    private int poolSize;
    private ExecutorService executorService;
    public ThreadManager(int poolSize){
        this.poolSize=poolSize;
        executorService=Executors.newFixedThreadPool(this.poolSize);
    }
    public void execute(Runnable runnable){
        executorService.submit(runnable);
    }
    //in this we are waiting until the until the queue size becomes less than the thread pool
    public void waitTillQueueIsFreeAndAddTask(Runnable runnable){
        while(getQueueSize()>=poolSize){
            try{
               // System.out.println("Sleeping");
                Thread.currentThread().sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        execute(runnable);
    }

    //This function is just returning the queue size
    private int getQueueSize(){
        ThreadPoolExecutor executor=(ThreadPoolExecutor) (executorService);
        return executor.getQueue().size();
    }

    public static void main(String[] args) {
        ThreadManager threadManager=new ThreadManager(100);
        for(int i=0;i<1000;i++){
            RunnableExample temp=new RunnableExample("thread-No"+i,0,500+i);
            threadManager.execute(temp);
        }
    }
}
