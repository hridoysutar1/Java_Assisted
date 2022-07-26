package Lesson3;

public class tryCatcheExample {
    public static void main(String[] args) {
        int [] arr=new int[4];
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds!");
        }finally {
            System.out.println("max size of array : "+arr.length);
        }
    }
}
