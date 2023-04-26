package com.example.algorithm.chapter01;

import java.util.Scanner;

public class chap1_1 {

    //최댓값 구하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 값을 구합니다");
        System.out.print("a의 값 : "); int a = sc.nextInt();
        System.out.print("b의 값 : "); int b = sc.nextInt();
        System.out.print("c의 값 : "); int c = sc.nextInt();

        // a,b,c, 최댓값을 구하여 max 에 대입한다.
        int max = a;
        if ( b > max) max = b;
        if ( c > max) max = c;

        System.out.println("최댓값은 " + max +"입니다. ");

    }

}
