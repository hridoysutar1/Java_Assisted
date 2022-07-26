package Lesson3;
class Animal{
    String name;
    int av_age;
    String color;
    Animal(String name,String color, int av_age){
        this.av_age=av_age;
        this.name=name;
        this.color=color;
    }
    void getInfo(){
        System.out.println("name : "+name+" color : "+color+" average age : "+av_age);
    }
    void eat(){
        System.out.println("Can eat");
    }
    void walk(){
        System.out.println("can walk");
    }
}
public class oopsConcept {
    public static void main(String[] args) {
         Animal dog=new Animal("dog","brown",10);
         dog.getInfo();
         dog.eat();
         dog.walk();
    }
}
