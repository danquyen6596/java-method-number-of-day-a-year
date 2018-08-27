package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year1, year2, totalDay = 0;
        System.out.print("Nhập vào năm bắt đầu: ");
        year1 = scanner.nextInt();
        System.out.print("Nhập vào năm kết thúc: ");
        year2 = scanner.nextInt();

        for (int i = year1; i <= year2; i++)
        {
            totalDay += numberOfDaysInAYear(i);
        }

        System.out.print("Tổng số ngày là: "+totalDay);

    }

    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear)
            return 366;
        else
            return 365;
    }
}
