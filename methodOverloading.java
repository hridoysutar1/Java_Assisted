package Lesson2;

public class methodOverloading {
    public void area(int x){
        int ar=x*x;
        System.out.println("Area of square is: "+ar);
    }
    public void area(int a,int b){
        int ar=a*b;
        System.out.println("Area of rectangle is: "+ar);
    }

    public static void main(String[] args) {
        methodOverloading m=new methodOverloading();
        m.area(10);
        m.area(10,20);
    }
}
