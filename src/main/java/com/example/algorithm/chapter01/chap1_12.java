package com.example.algorithm.chapter01;

import java.util.Scanner;

public class chap1_12 {


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다");

        // n값으로 양수만 입력 받도록 조건 정함

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0; // 합


        for (int i = 1; i <= n; i++){
            if ( i < n){ //중간과정
                System.out.print(i + " + ");
            } else { // 마지막 과정
                System.out.print(i + " + ");
            }
            sum += i; // sum에 i를 더함

        }
        System.out.print(sum);
//
//        System.out.println("================");
//        System.out.println("1부터 " + n + "까지의 합은 " + sum +" 입니다.");
//        System.out.println("1부터 " + n + "까지의 합은 " + sum +" 입니다.");


    }





}
