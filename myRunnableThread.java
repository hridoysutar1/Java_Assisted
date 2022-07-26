package Lesson3;

public class myRunnableThread implements Runnable{

public void run(){
    System.out.println("Thread using Runnable interface");
}

    public static void main(String[] args) {
        myRunnableThread mrt=new myRunnableThread();
        Thread th=new Thread(mrt);
        th.start();
    }
}
