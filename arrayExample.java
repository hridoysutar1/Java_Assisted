package Lesson2;

public class arrayExample {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        System.out.println("1D Array elements are : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [][] arr2={{1,2},{3,4,5},{6,7,8,9}};
        System.out.println("Length of row 3 is: "+arr2[2].length);
    }
}
