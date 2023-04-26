package com.example.algorithm.chapter01;
// 클래스 선언보다 먼저 작성한다.
import java.util.Scanner;

public class chap1_1 {

    //최댓값 구하기

    public static void main(String[] args) {
        // main 메서드의 앞쪽에 작성한다.
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 값을 구합니다");
        System.out.print("a의 값 : "); int a = sc.nextInt(); //nextInt() 키보드로 입력한 값중에 정숫값을 읽어온다
        System.out.print("b의 값 : "); int b = sc.nextInt();
        System.out.print("c의 값 : "); int c = sc.nextInt();

        // a,b,c, 최댓값을 구하여 max 에 대입한다.
        int max = a;
        if ( b > max) max = b;
        if ( c > max) max = c;

        System.out.println("최댓값은 " + max +"입니다. ");

    }

}
