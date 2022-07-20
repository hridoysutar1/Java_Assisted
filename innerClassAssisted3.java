package Lesson2;

abstract class anno{
    public abstract void display();
}
public class innerClassAssisted3 {
    public static void main(String[] args) {
        anno a=new anno() {

            public void display() {
                System.out.println("This example of Anonymous innner class");
            }
        };
        a.display();
    }
}
