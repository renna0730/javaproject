package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수를 입력하십시오: ");
        int score = s.nextInt();

//        if (score < 70) {
//            System.out.println("불합격");
//        }
//        else {
//            System.out.println("합격");
//        }

        String result = "";
        if (score >= 70) {
            result = "합격";
        }
        else {
            result = "불합격";
        }
        System.out.println("현재 성적을 입력한 운전자는 " + result + "입니다.");

    }
}
