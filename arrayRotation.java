package lesson4;

public class arrayRotation {

public  void rotate(int[] arr,int k){
    if (k>arr.length){
        k=k%arr.length;
    }
    int[] newArr=new int[arr.length];
    for (int i=0;i<k;i++){
        newArr[i]=arr[arr.length-k+i];
    }
    int j=0;
    for (int i=k;i<arr.length;i++){
        newArr[i]=arr[j];
        j++;
    }
    System.arraycopy(newArr,0,arr,0,arr.length);
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        arrayRotation r=new arrayRotation();
        r.rotate(arr,5);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
