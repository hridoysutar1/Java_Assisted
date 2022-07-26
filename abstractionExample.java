package Lesson3;
abstract class Shape{
    int x=10;
    abstract void area();
}
class square extends Shape{
    void area(){
        int a=super.x;
        System.out.println("The area of circle is : "+ a);
    }
}
public class abstractionExample {
    public static void main(String[] args) {
        square s=new square();
        s.area();
    }
}
