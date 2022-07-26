package Lesson3;
class X{
    private int id;
    private String name;
    private String city;
    void setInfo(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }
    void getInfo(){
        System.out.println("Id : "+id+" Name : "+name+" city : "+city);
    }
}

public class encapsulationExample {
    public static void main(String[] args) {
        X ob=new X();
        ob.setInfo(12345,"John","London");
        ob.getInfo();
    }
}
