package first_lesson;
class Def{
     void display(){
        System.out.println("Using default access modifier");
    }
}
public class AccessModifier {
    private void show(){
        System.out.println("Using private access modifier");
    }
    public static void main(String[] args) {
        System.out.println("Default access modifier");
        Def a=new Def();
        a.display();

        System.out.println();

        System.out.println("Private access modifier");
       AccessModifier b=new AccessModifier();
       b.show();
    }
}
