package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Yêu cầu 1: Tính tổng từ 1 đến 100 dùng vong lặp (for)
        int sum = 0;
        for (int a = 1; a <= 100; a++){
            sum = sum + a;
        }
        System.out.println("Tong tu 1 đen 100 la: " + sum);

        // Yêu cầu 2: In ra các số chẵn từ 2 đến 20 (while)
        int a = 2;
        while (a <= 20){
            if (a % 2 == 0){
                System.out.println("Các so chan la: " + a);
            }
            a ++;
        }

        // Yêu cầu 3: Viết một trương trình Java nhập mật khẩu từ bàn phím, nếu người dùng nhập sai thì yêu cầu người dùng nhập lại.
        String password = "123456" ;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap mat khau: ");
        String inputPassword = sc.nextLine();
        do {
            if(!inputPassword.equals(password)){
                System.out.printf("Yeu cau nhap lai vi sai mat khau: ");
                inputPassword = sc.nextLine();

            }
        } while (!inputPassword.equals(password));
        System.out.println("Mat khau dung");

    }
}
