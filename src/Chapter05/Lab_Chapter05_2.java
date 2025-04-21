package Chapter05;

import java.util.Scanner;

public class Lab_Chapter05_2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("--------------- 가위바위보 ---------------\n");
        System.out.print("가위 바위 보 중에 하나 입력하시오.: ");
        String myHand = s1.nextLine();

        String[] Hands = {"가위", "바위", "보"};
//        int randomIndex = (int)(Math.random() * Hands.length);
//        String computerHand = Hands[randomIndex];  // 이거랑 아래랑 똑같다
        String computerHand = Hands[(int)(Math.random() * Hands.length)];

        if(myHand.equals("가위")) {
            if(computerHand.equals("가위"))
                System.out.println("비겼다");
            else if (computerHand.equals("바위"))
                System.out.println("졌다");
            else
                System.out.println("이겼다");
        }else if(myHand.equals("바위")) {
            if(computerHand.equals("바위"))
                System.out.println("비겼다");
            else if (computerHand.equals("보"))
                System.out.println("졌다");
            else
                System.out.println("이겼다");
        }else if(myHand.equals("보")) {
            if (computerHand.equals("보"))
                System.out.println("비겼다");
            else if (computerHand.equals("가위"))
                System.out.println("졌다");
            else
                System.out.println("이겼다");
        }else
            System.out.println("가위, 바위, 보 중에서 하나 입력하시오");

        s1.close();
    }
}
