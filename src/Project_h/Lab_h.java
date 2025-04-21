package Project_h;

import java.util.Scanner;

public class Lab_h {
    public static void main(String[] args) {
        double score_sum = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner sc_ = new Scanner(System.in);

        System.out.print("몇 과목입니까? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[count];
        int[] credit = new int[count];
        double[] score = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "과목 이름 입력: ");
            subjects[i] = scanner.nextLine();

            System.out.print(subjects[i] + " 이수학점 입력: ");
            credit[i] = sc_.nextInt();

            System.out.print(subjects[i] + " 성적 입력: ");
            score[i] = sc_.nextDouble();

            score_sum += credit[i]*score[i];
            sc_.nextLine();

        }
        int total_credit = 0;
        for (int i = 0; i < count; i++) {
            total_credit += credit[i];
        }

        double score_avg = score_sum / total_credit;
        System.out.printf("평균학점 : %.2f\n", score_avg);
        scanner.close();
    }
}