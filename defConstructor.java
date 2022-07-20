package Lesson2;

class emp{
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
}
public class defConstructor {

    public static void main(String[] args) {
      emp e=new emp();
      emp e2=new emp();
      e.display();
      e.display();
    }
}
