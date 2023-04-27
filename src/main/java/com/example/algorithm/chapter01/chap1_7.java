package com.example.algorithm.chapter01;
// 클래스 선언보다 먼저 작성한다.

import java.util.Scanner;

public class chap1_7 {
    // while문으로 1부터 n까지의 합을 구함

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        // 합
        int sum = 0;
        int i = 1;

        while (i <= n){ // i가 n 이하면 반복함
            sum += i; // sum에 i를 더함
            i++; // i값을 1만큼 증가시킴
        }

        System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
    }
}
