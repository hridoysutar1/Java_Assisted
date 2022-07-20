package Lesson2;

public class innerClassAssisted2 {
    private String str="Hi!";
    void display(){
        class inner{
            void show(){
                System.out.println(str+"this is  Inner class inside method");
            }
        }
        inner in= new inner();
        in.show();
    }

    public static void main(String[] args) {
        innerClassAssisted2 i=new innerClassAssisted2();
        i.display();
    }
}
