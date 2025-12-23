package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1.\tTính tổng các số từ 1 đến 100.");
            System.out.println("2.\tIn bảng chữ cái từ A đến Z.");
            System.out.println("3.\tThoát.");
            System.out.print("Nhập lựa chọn của bạn (1-3): ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    sumFrom1To100();
                    break;
                case 2:
                    printAlphabetAtoZ();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        while(choice != 3);
        sc.close();
    }
    public static void sumFrom1To100() {
        int sum = 0;
        for(int i = 1; i <= 100;i++){
            sum += i;
        }
        System.out.println("Tổng các số từ 1 đến 100 là: " + sum);
    }
    public static void printAlphabetAtoZ() {
        for(char c = 'A'; c <= 'Z'; c++){
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

