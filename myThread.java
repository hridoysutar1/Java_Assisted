package Lesson3;

public class myThread extends Thread{
    public void run() {
        System.out.println("Thread started running");
    }

    public static void main(String[] args) {
        myThread thread=new myThread();
        thread.start();
    }
}
