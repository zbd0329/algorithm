package com.example.algorithm.chapter01;

import java.util.Scanner;

public class chap1_8 {

    // 하나의 변수를 사용하는 반복문은 while문보다 for문을 사용하는 것이 ㅈ ㅗㅎ다.
    // 조건이 참인 경우 {명령문}을 반복한다.

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0 ; // 합

        for (int i = 1; i <= n; i++ ){
            sum += i;

            System.out.println("1부터 " + i + "까지의 합은" + sum + "입니다.");
        }
        System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");


        //sumof

        int a = 1, b = 10;
        sumof(a, b);
        System.out.println("Sum of " + a + " to " + b + " is " + sum);
    }



    //연습문제
    public static void sumof(int a , int b) {

        a = 1;
        b = 9;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += 1;
        }

    }


}
