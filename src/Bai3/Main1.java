package Bai3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm cần kiểm tra: ");
        year = sc.nextInt();
        checkLeapYear(year);
        sc.close();
    }
    public static void checkLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
}
