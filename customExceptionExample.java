package Lesson3;

public class customExceptionExample extends Exception {
    public customExceptionExample(String s){
             super(s);
        }
    public static void main(String[] args) {
         try {
             throw new customExceptionExample("temp");
         }catch (customExceptionExample e){
             System.out.println("caught");
             System.out.println(e.getMessage());
         }


    }
}
