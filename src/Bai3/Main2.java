package Bai3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if (n > 0){
             for( int i = 2; i <= Math.sqrt(n); i++){
                 if (n % i == 0){
                     System.out.println(n + " không phải số nguyên tố.");
                     break;
                 }
             }
         }
    }
}
