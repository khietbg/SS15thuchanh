package bai2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[100];
        for (int i = 0; i < 100; i++) {
           arr[i]=new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap so muon kiem tra vi tri:");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                System.out.println( "vi tri cua so "+ num+"la: "+i);
                return;
            }

        }
//        throw new RuntimeException();
        try {
            throwsEx();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static Exception throwsEx() throws Exception {
         throw  new Exception();
    }
}
