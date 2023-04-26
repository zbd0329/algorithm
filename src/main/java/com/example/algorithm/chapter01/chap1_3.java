package com.example.algorithm.chapter01;
// 클래스 선언보다 먼저 작성한다.

import java.util.Scanner;

public class chap1_3 {

    //조건 판단과 분기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println( "이 수는 양수입니다");
        } else if (n < 0) {
            System.out.println("이 수는 음수입니다");
        } else {
            System.out.println("이 수는 0 입니다");
        }

    }
}
