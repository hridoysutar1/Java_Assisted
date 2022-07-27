package Lesson5;

public class insertionSortExample {
    public static void insertionSort(int [] arr){
        int len=arr.length;
        for (int i=1;i<len;i++){
            int key=arr[i];
            int j=i-1;
            while ((j > -1) && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={35,23,66,53,22,67,12};
        insertionSort(arr);
        for (int item:arr){
            System.out.print(item+" ");
        }

    }
}
