package Lesson5;

public class bubbleSortExample {
    public static void bubbleSort(int[] arr,int len){
        int temp;
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if (arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={43,65,22,67,21,39,12};
        int len=arr.length;
        bubbleSort(arr,len);
        System.out.println("sorted array");
        for (int item:arr){
            System.out.print(item+" ");
        }
    }
}
