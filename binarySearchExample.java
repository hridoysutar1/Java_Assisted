package Lesson5;

public class binarySearchExample {
    public static void binSearch(int[] arr, int s, int key, int len){

        int midValue = (s+len)/2;
        while(s<=len){

            if(arr[midValue]<key){

                s = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                len=midValue-1;
            }
            midValue = (s+len)/2;
        }
        if(s>len){
            System.out.println("Element is not found");
        }

    }
    public static  void main(String[] args){

        int[] arr = {2,5,8,9,12,34,45,65};
        int key = 34;
        int arrlen = arr.length;
        binSearch(arr,0,key,arrlen);
    }



}
