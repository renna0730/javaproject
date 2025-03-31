package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
       /*
        //내가 한 프로그램
        Scanner s1 = new Scanner(System.in);
        System.out.print("* 받는사람 : ");
        String name = s1.nextLine();
        System.out.println(" 받는사람 :" + name);

        System.out.print("* 주소 : ");
        String address = s1.nextLine();
        System.out.println(" 주소 :" + address);

        Scanner s2 = new Scanner(System.in);
        System.out.print("* 무게(g) : ");
        int weight = s2.nextInt();
        System.out.println(" 무게 :" + weight );

        System.out.println( "배송비 : " + weight * 5);

        s1.close();
        s2.close();
       */

    //교수님과 함께
     // 입력
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("복습용 실습 1 택배보내기 프로그램: 다음의 항목을 입력하십시오.");
        System.out.print("* 받는사람 : ");
        String name = s1.nextLine();
        System.out.print("* 주소 : ");
        String address = s1.nextLine();
        System.out.print("* 무게(g) : ");
        int weight = s2.nextInt();

            // 배송비는 1g당 5원
        int price = weight * 5 ;
            // 출력
        System.out.println("** 받는 사람 : " + name + "님");
        System.out.println("** 받는 분 주소 : " + address );
        System.out.println("** 배송비 : " + price + "원");

        s1.close();
        s2.close();
    }
}
