package Lesson3;

public class exceptionDemo extends Exception {
    String s1;
    public exceptionDemo(String s2){
        s1=s2;
    }
    public String toString(){
        return ("myexception : "+s1);
    }
    public static void main(String[] args) {

           try {
               System.out.println("try block excuted");
               throw new exceptionDemo("here is error msg");
           }catch (exceptionDemo e){
               System.out.println("catch block");
               System.out.println(e);
           }

    }
}
