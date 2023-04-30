package com.example.algorithm.chapter01;

import java.util.Scanner;

public class chap1_9 {

    // 하나의 변수를 사용하는 반복문은 while문보다 for문을 사용하는 것이 ㅈ ㅗㅎ다.
    // 조건이 참인 경우 {명령문}을 반복한다.

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다");

        // n값으로 양수만 입력 받도록 조건 정함

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum +" 입니다.");


    }





}
