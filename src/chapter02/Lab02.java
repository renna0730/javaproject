import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        // 내가 생각한 코드는 중간에 주석처리 됨

        // 이게 무슨 프로그램인지 처음에 설명해주면 좋다
        System.out.println("\n\n ====== 단순 계산기 ====== \n\n");

        Scanner s1 = new Scanner(System.in);
        System.out.print("* 정수1 : ");
        int num1 = s1.nextInt();

        System.out.print("* 정수2 : ");
        int num2 = s1.nextInt();

/*      내가 생각한 코드
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
*/

        // 교수님과 함께 /입력
        int resPlus, resMinus, resMultiply, resDivide, resMod;
        resPlus = num1 + num2;
        resMinus = num1 - num2;
        resMultiply = num1 * num2;
        resDivide = num1 / num2;
        resMod = num1 % num2;

        // 출력
        System.out.printf("%d + %d = %d\n", num1, num2, resPlus);
        System.out.printf("%d - %d = %d\n", num1, num2, resMinus);

        //정수 실수 계산 유의
        System.out.printf("%d * %d = %d\n", num1, num2, resMultiply);

        System.out.printf("%d / %d = %d\n", num1, num2, resDivide);

        //주석 처리한 아래 코드를 그대로 출력하면 IllegalFormat 과 같은 오류가 생김
        // 이유는 % 때문에
        // System.out.printf("%d % %d = $d\n", num1, num2, resMod);


       /* 오류가 안 나는 방법 1. System.out.printf("%d mod %d = $d\n", num1, num2, resMod);
          오류가 안 나는 방법 2. System.out.println(num1 + " % " + num2 + " = " + resMod);
          + println과 printf, print 주의!!

        일단 실행을 위해서 방법 2를 채택했다.
         */
        System.out.println(num1 + " % " + num2 + " = " + resMod);

        s1.close();

    }
}
