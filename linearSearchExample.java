package Lesson5;

import java.util.Scanner;

public class linearSearchExample {
    public static void main(String[] args){
           int [] arr={1,3,5,6,7,8,9};
        System.out.println("Enter a element to be searched");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("element found at index no "+i);
                k++;
            }
        }
        if (k==0){
            System.out.println("element not found");
        }

    }}

