package Lesson5;
import java.util.Arrays;
public class exponentialSearchExample {
    public static int exponentialSearch(int[] arr ,int len, int key ){
        if(arr[0]==key){return 0;}
        int i=1;
        while(i<len && arr[i]<=key){
            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,len),key);
    }
    public static  void main(String[] args){

        int[] arr = {1,4,6,9,54,34,35};
        int length= arr.length;
        int value = 18;
        int outcome = exponentialSearch(arr,length,value);

        if(outcome<0){
            System.out.println( "Element is not present in the array");
        }else {
            System.out.println( "Element is  present in the array at index :"+outcome);
        }
    }



}
