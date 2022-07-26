package Lesson3;

public class throwKeywordExample {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            if (b==0){
                throw (new ArithmeticException("a number can not divide by zero"));
            }
            else
            {
                System.out.println(a/b);
            }
        }catch (ArithmeticException e){
            System.out.println("Arithmatic Exception : "+e.getMessage());
        }
    }
}
