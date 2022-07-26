package Lesson3;
class vehicle{
    void fun(String name){
        System.out.println(name +" contain accelarator, gear, break. ");
    }
}
class car extends vehicle{

}
public class inheritanceExample
{
    public static void main(String[] args) {
        car c=new car();
        //inheriting parent behaviour
        c.fun("car");
    }
}
