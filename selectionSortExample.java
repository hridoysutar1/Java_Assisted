package Lesson5;

public class selectionSortExample {
    public static void selectinSort(int [] arr,int len){
        for (int i=0;i<len;i++){
            int sel=i;
            for (int j=i+1;j<len;j++){
                if (arr[j]<arr[sel]){
                    sel=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[sel];
            arr[sel]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={32,546,141,675,25,765,255};
        int len=arr.length;
        selectinSort(arr,len);
        for (int item:arr){
            System.out.print(item+" ");
        }
    }
}
