package Lesson3;
interface i1{
    default void show(){
        System.out.println("1st interface method");
    }
}
interface i2{
    default void show(){
        System.out.println("2nd interface method");
    }
}


public class dimondProblem implements i1,i2 {
    public void show(){
        i1.super.show();
        i2.super.show();
    }
    public static void main(String[] args) {
      dimondProblem d=new dimondProblem();
      d.show();
    }
}
