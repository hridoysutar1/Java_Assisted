package Lesson2;

class stu{
    String name;
    int roll;
    stu(String n,int r){
        name=n;
        roll=r;
    }
    void display(){
        System.out.println(name+" "+roll);
    }
}
public class paraConstructor {
    public static void main(String[] args) {

        stu s2=new stu("Ram",5);
        s2.display();


    }
}
