package chapter03;

import java.util.Scanner;

public class Code3_Lab01 {
    public static void main(String[] args) {

       // 내가 짠 코드
        double lb = 0.543592;
        double kg = 2.204623;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter lb: ");
        int num1 = s.nextInt();
        System.out.print("Enter kg: ");
        int num2 = s.nextInt();

        double result1 = lb * num2;
        double result2 = kg * num1;

        System.out.printf("%d 파운드는 %f 킬로그램입니다.\n", num1, result2);
        System.out.printf("%d 파운드는 %f 킬로그램입니다.", num2, result1);
        s.close();


    }
}
