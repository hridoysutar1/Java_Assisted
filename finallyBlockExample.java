package Lesson3;

public class finallyBlockExample {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            System.out.println("division is: "+a/b);
        }catch (ArithmeticException e){
            System.out.println("error"+ e.getMessage());
        }finally {
            System.out.println("ans: "+0);
        }
    }
}
