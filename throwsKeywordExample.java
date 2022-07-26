package Lesson3;

public class throwsKeywordExample {
    void division()throws ArithmeticException{
        int a=20,b=0;
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        throwsKeywordExample t=new throwsKeywordExample();
        try {
            t.division();
        }catch (ArithmeticException e){
            System.out.println("erorr: "+e.getMessage());
        }
    }
}
