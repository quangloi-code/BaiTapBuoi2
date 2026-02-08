package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Yêu cầu 1: Tính tổng từ 1 đến 100 dùng vòng lặp (for)
        int sum = 0;
        for (int a = 1; a <= 100; a++){
            sum = sum + a;
        }
        System.out.println("Tong từ 1 đến 100 là: " + sum);

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




        // 3/2/2026
        // Bài 1: Nhập số nguyên dương N, và in từ 1 đến N.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen duong. ");
        } else {
            int i = 1;
            System.out.println("Cac so nguyen duong tu 1 den " + n + " la:");
            while (i <= n) {
                System.out.println(i ++);
            }
            i++;
        }




        // Bài 2: Nhập số nguyên N và tính tổng từ 1 đê
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so nguyen N la: ");
        int n = sc.nextInt();
        int sum = 0;
        if (n >= 1){
            int a = 1;
            while (a <= n){
                if (a % 2 == 0){
                    sum = sum + a;
                }
                a++;
            }
            System.out.printf("Tong so nguyen tu 1 den " + n + " la: " + sum);
        }else{
            System.out.println("Khong co so chan nao tư 1 den N.");
        }




        // Bài 3: In ra bảng cửu chương từ 1 đến 9 dùng vòng lặp for.
        System.out.println("Bảng cưu chương.");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng nhân " + i + " là: ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);}
        }
        System.out.println();





        // Bài 4: Viết trương trình kiểm tra số nguyên tố.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Day khong phai so nguyen to. ");
        } else if ( n % 2 != 0) {
            System.out.println("Day la so nguyen to. ");
        } else if (n % 2 == 0) {
            System.out.println("Day khong phai so nguyen to. ");
        } for (int a = 3; a <= Math.sqrt(n); a += 2){
            if (n % a == 0) {
                System.out.println("Đay khong phai so nguyen to. ");
            }
        }



        // Bai 5: Nhập số nguyên n rồi đếm chữ số.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int number = sc.nextInt();
        int n = Math.abs(number);
        int a = 0;
        int demSo = n;
        if (n == 0){
            a = 1;
        } else {
            while (demSo > 0) {
                a ++;
                demSo /= 10;
            }
        }
        System.out.println("So nguyen " + number + " co " + a + " chu so");
    }



    // Bai 6: Nhập 2 sô bất kì từ bàn phím sau đó hiện menu: tính tổng hai số, tính hiệu hai số và thoát trương trình.
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    int choice;
        do {
        System.out.println("====MENU====");
        System.out.println("1.Tính tổng hai số. ");
        System.out.println("2.Tính hiệu hai số. ");
        System.out.println("3.Thoát. ");
        System.out.print("Lựa chọn của bạn: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Nhap so a: ");
                a = sc.nextDouble();
                System.out.print("Nhap so b: ");
                b = sc.nextDouble();
                System.out.printf("Tổng hai số là: " + (a + b));
                break;
            case 2:
                System.out.print("Nhap so a: ");
                a = sc.nextDouble();
                System.out.print("Nhap so b: ");
                b = sc.nextDouble();
                System.out.println("Hiệu hai số là: " + (a - b));
                break;
            case 3:
                System.out.println("Cảm ơn bạn đã sử dụng trương trình.");
                break;
        }
    }
        while (choice != 3);
        return;




    // Bài 7: Nhập số nguyên n in ra và đảo ngược.
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n : ");
    int number = sc.nextInt();
    int soBanDau = number;
    int soDaoNguoc = 0;
        while (number != 0) {
        int chuSoCuoi = number % 10;
        soDaoNguoc = (soDaoNguoc * 10) + chuSoCuoi;
        number = number / 10;
    } System.out.print("Số ban đầu: " + soBanDau);
        System.out.printf("Số đảo ngược: " + soDaoNguoc);



        // Bài 8: Nhập số nguyên n và in ra số Fibonacci đầu tiên.
    Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số nguyên N: ");
    int n = sc.nextInt();
        if (n < 0) {
        System.out.printf("n Phải là số nguyên dương hoặc bằng 0.");
    } else {
        System.out.printf(+ n + " Số Fibonacci đầu tiên là:");
        long a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(a);
            } else if (i == 1) {
                System.out.print(" " + b);
            } else {
                long tiep = a + b;
                System.out.print(" " + tiep);
                a = b;
                b = tiep;
            }
        }
        System.out.println();
        return;
    }



        // Bài 9: Nhập số nguyên N so sánh số LN, NN.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
    int n = sc.nextInt();
        if (n <= 0){
        System.out.println("Số lượng phần tử phải lớn hơn 0.");
        return;
    }
        System.out.print("Nhập số thứ 1: ");
    int soThuNhat = sc.nextInt();
    int max = soThuNhat;
    int min = soThuNhat;
        for (int i = 2; i <= n; i ++){
        System.out.print("Nhập số thứ " + i + ": ");
        int so = sc.nextInt();
        if (so > max){
            max = so;
        }
        if (so < min){
            min = so;
        }
    }
        System.out.println("Số Lớn Nhất là: " + max);
        System.out.println("Số Nhỏ Nhất là: " + min);
        return;



        // Bài 10: Trò chơi đoán số: máy sinh ngẫu nhiên số từ 1 đến 100 người dùng cần nhập nhập số để đoán. Kết quả có thể trả về lớn hơn hoặc nhỏ hơn số cần đoán lặp lại đến khi đúng.
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với trò chơi đoán số. ");
        System.out.println("Sau đây tôi sẽ cho ngẫu nhiên một số từ 1-100. Bạn sẽ đoán số đó là gì?");
    Random random = new Random();
    int soCanDoan = random.nextInt(100) + 1;
    int soDoan;
    int soLuotDoan = 0;
        while (true) {
        System.out.print("Nhập số bạn đoán: ");
        soDoan = sc.nextInt();
        soLuotDoan++;
        if (soDoan < 1 || soDoan > 100){
            System.out.println("Số đoán phải nằm trong khoảng từ 1 đến 100. ");
        } else if (soDoan > soCanDoan){
            System.out.println("Lớn hơn số cần đoán.");
        } else if (soDoan < soCanDoan){
            System.out.println("Nhỏ hơn số cần đoán.");
        } else {
            System.out.println("Chúc mừng bạn đã đoán đúng số cần đoán là " + soDoan + "sau số lần đoán là " + soLuotDoan );
            break;
        }
    }

}





