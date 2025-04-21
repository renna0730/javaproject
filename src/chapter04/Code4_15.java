package chapter04;

public class Code4_15 {
    public static void main(String[] args) {
        String str1 = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요~";
        System.out.println(str1.indexOf("처음"));
        System.out.println(str1.indexOf("처음", 6));
        System.out.println(str1.indexOf("처음", 11));


        String str2 = "Java";
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(1));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(3));
        System.out.println(str2.charAt(4)); // 다섯번째 문자가 없어서 오류가 남

        System.out.println(str2.substring (0, 2)); //av 문자열이 반환된다.

    }
}
