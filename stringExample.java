package Lesson2;

import java.util.Locale;

public class stringExample {
    public static void main(String[] args) {
        System.out.println("Methods of string");
        String str="This is a string";
        System.out.println(str.length());

        //sub string
        String s="america";
        System.out.println(s.substring(2));

        //string comparision
        String s1="Hello";
        String s2="Heldo";
        System.out.println(s1.compareTo(s2));

        //isEmplty
        String s3="";
        System.out.println(s3.isEmpty());

        //toLower case
        String s4="RAM";
        System.out.println(s4.toLowerCase());

        //replace
        String s5="Ron";
        String replace=s5.replace("o","u");
        System.out.println(replace);

        //equals
        System.out.println(s1.equals(s2));
        System.out.println();

        //StringBuffer
        //append
        System.out.println("Stringbuffer example");
        StringBuffer b=new StringBuffer("This is");
        b.append("a man");
        System.out.println(b);

        //replace
        StringBuffer b1=new StringBuffer("rummy");
        b1.replace(0,2,"Hone");
        System.out.println(b1);
        //delete
        b1.delete(0,1);
        System.out.println(b1);
        System.out.println();

        //Stringbuilder
        System.out.println("Sringbuilder example : ");
        StringBuilder bui=new StringBuilder("Earth moves around the ");
        bui.append("sun");
        System.out.println("bui");
        System.out.println(bui.delete(0,5));
        System.out.println(bui.insert(1,"daily"));
        System.out.println(bui.reverse());
        System.out.println();


        //conversion
        System.out.println("conversion string to stringbuffer and stringbuilder");
        String stri="open the door";
        System.out.println("string to string buffer");
        StringBuffer buf=new StringBuffer(stri);
        buf.reverse();
        System.out.println(buf);

        System.out.println("string to stringbuilder");
        StringBuilder build=new StringBuilder(stri);
        build.append(" quickly");
        System.out.println(build);









    }
}
