package bai1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap size");
        int size = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        Boolean needNextPass = true;
        for (int i = 0; i < size&& needNextPass; i++) {
            needNextPass=false;
            for (int j = 0; j < size-i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    needNextPass= true;
                }
            }
        }
        System.out.println("sau khi sap xep"+Arrays.toString(arr));
    }
}