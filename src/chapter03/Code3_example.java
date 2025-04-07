package chapter03;

import java.util.Scanner;

public class Code3_example {
    public static void main(String[] args) {
        //내가 작성한 프로그램
        Scanner s = new Scanner(System.in);
        System.out.print("키를 입력하십시오: ");
        double num1 = s.nextDouble();

        System.out.print("체중을 입력하십시오: ");
        double num2 = s.nextDouble();

        double result1 = num1 / 100;
        double result2 = num2 / Math.pow(result1, 2);

        System.out.printf("당신은 키가 %.1f(cm), 체중이 %.2f(kg)이므로 BMI는 %f (kg/m^2)입니다.", num1, num2, result2);
        s.close();
    }
}
