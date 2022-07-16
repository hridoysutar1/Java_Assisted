package first_lesson;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Implicit typecasting");
        char c='A';
        System.out.println("value of c: "+c);
        int x=c;
        System.out.println("value of x: "+x);
        float f=c;
        System.out.println("value of f: "+f);
        long l=c;
        System.out.println("value of l: "+l);
        double d =c;
        System.out.println("value of d: "+d);
        System.out.println();

        System.out.println("Eplicit typecasting");
        double m=10.59;
        System.out.println("value of m: "+m);
        int n=(int) m;
        System.out.println("value of n: "+n);



    }
}
