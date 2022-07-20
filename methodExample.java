package Lesson2;

public class methodExample {
    public int addnum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        methodExample m=new methodExample();
       int d= m.addnum(12,10);
        System.out.println("Addition ans: "+ d);
    }
}
