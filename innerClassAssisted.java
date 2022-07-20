package Lesson2;

public class innerClassAssisted {
    private String msg="Hello!";
    class inner{
        void display(){
            System.out.println(msg+" This is inner class method");
        }
    }

    public static void main(String[] args) {
        innerClassAssisted a=new innerClassAssisted();
        innerClassAssisted.inner in=a.new inner();
        in.display();
    }
}
