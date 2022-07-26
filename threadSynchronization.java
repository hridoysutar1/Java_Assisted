package Lesson3;

class sender{
    public void send(String msg){
        System.out.println("Sending message :  "+msg);
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("sent");
    }
}
class threadSend extends Thread{
    private String msg;
    private Thread t;
    sender  Sender;
    threadSend(String m,  sender obj)
    {
        msg = m;
        Sender = obj;
    }

    public void run()
    {
        synchronized(Sender)
        {
            Sender.send(msg);
        }
    }

}
public class threadSynchronization
{
    public static void main(String[] args) {

        sender snd = new sender();
        threadSend S1 =
                new threadSend( " Hi " , snd );
        threadSend S2 =
                new threadSend( " Bye " , snd );
        S1.start();
        S2.start();
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }

    }
}
