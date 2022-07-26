package Lesson3;
 class A{
     void area(int x){
         System.out.println("Area of square is : "+ x*x);
     }
     void area(int a,int b){
         System.out.println("Area of rectangle is : "+ a*b);
     }
 }
public class polymorphismExample {

    public static void main(String[] args) {
       A obj=new A();
       obj.area(10);
       obj.area(10,5);
    }
}
