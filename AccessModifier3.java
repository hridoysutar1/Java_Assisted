package first_lesson;
import test_lesson.*;

public class AccessModifier3 {
    public static void main(String[] args) {
        System.out.println("Public access modifier");
       Test t=new Test();
       t.pub();
    }
}
