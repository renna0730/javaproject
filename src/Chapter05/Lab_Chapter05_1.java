package Chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class Lab_Chapter05_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("--------------- PC방 시간 ---------------\n");
        System.out.print("출생년도를 4자리 정수로 입력하시오.: ");
        int birthYear = s1.nextInt();


        Calendar calender = Calendar.getInstance();
        int now_year = calender.get(Calendar.YEAR);

        int age = now_year - birthYear;
        String resultStr = "";

        if(age >=18) {
            resultStr = "즐거운 시간 보내시면 됩니다.";
        }
        else {
            resultStr = "집에 가실 시간입니다.";
        }


//      System.out.println(resultStr);
        System.out.println("귀하의 나이는 " + age + "세이므로 " + resultStr);
        System.out.println("협조해주셔서 감사힙니다.");


        s1.close();
    }
}
