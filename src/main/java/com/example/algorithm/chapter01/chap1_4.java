package com.example.algorithm.chapter01;
// 클래스 선언보다 먼저 작성한다.

import java.util.Scanner;

public class chap1_4 {

    //조건 판단과 분기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println( "A");
        } else if (n == 2) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

    }
}
