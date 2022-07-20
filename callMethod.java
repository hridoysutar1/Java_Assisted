package Lesson2;

public class callMethod {
    int v=1500;
    int oparation(int v){
        v=v*100/1000;
        return v;
    }

    public static void main(String[] args) {
        callMethod m=new callMethod();
        System.out.println("Before operation value of data is: "+m.v);
        m.oparation(100);
        System.out.println("After operation value of data is: "+m.v);
    }
}
