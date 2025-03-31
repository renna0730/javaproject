package chapter02;

public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        /* int num1 = 10, num2 = 20; 가능 */

        double result;

        result = num1 + num2;

        System.out.printf("%d + %d = %.1f\n", num1, num2, result);
        /*실수값의 경우 %f라고 표시한다. %.nf는 n번째 자리 까지의 소숫점 자리를 표현한다 n=0 가능*/

        result = num1 / (double) num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);

        /*정수형과 정수형을 계산하면 정수부만 저장되므로, 원하는 실수값을 얻으려면 정수형 둘 중 하나를 실수형으로 변경해야 한다.*/
    }
}
