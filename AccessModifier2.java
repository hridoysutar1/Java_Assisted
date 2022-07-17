package first_lesson;
class X{
    protected void see(){
        System.out.println("Using protected access modifier");
    }
}
class Y extends X{

}
public class AccessModifier2 {
    public static void main(String[] args) {
        System.out.println("Protectd accesss modifier by subclass");
        Y c=new Y();
        c.see();
    }
}
