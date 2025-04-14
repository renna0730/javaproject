package chapter04;

public class DataTypeTest {
    public static void main(String[] args) {
        // 숫자가 아닌 자료형 boolean, char
        boolean boo1 = false;
        boolean boo2 = 100 > 200; // false
        boolean boo3 = !boo1; // true

        char ch1 = 'A';
        char ch2 = 97; // 유니코드값
      // 오류발생  char ch3 = ch2 + 5;
        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);

        System.out.println("ch1+3: " + (char)(ch1 + 3));

      // 숫자 자료형: 정수형과 실수형
      // 정수형: byte, short, int, long


      // byte byte1 = 128; // overflow의 사례, 값이 너무 커!!
      byte byte2 = 127;
      // byte byte3 = -129; // underflow의 사례, 값이 너무 작아!!
        byte byte4 = byte2;

        System.out.println("byte2: " + byte2);
        System.out.println("byte4: " + byte4);

        short short1 = 128;
        short short2 = byte2; // byte byte5 = short1; >> 불가능
       // byte4 = short1 -1; 우변 연산은 short형으로 진행되므로 불가능하다.

        int int1 = byte2;
        int int2 = short1;
        int int3 = 1000000000;

        long long1 = byte2;
        long long2 = short1;
        long long3 = int1;
        long long4 = long1;
        long long5 = (long)Math.pow(10, 15);

        System.out.println("long5: " + long5);

        // 실수형: float, double
       // float float1 = 123.456; double형으로 인식하므로 아래 코드처럼 f나 형변환 형식이 필요하다 / 형변환
        float float1 = 123.456f;
        float float2 = (float) 200.345;
        float float3 = short1;
        float float4 = 100;

        double double1 = 123.456;
        double double2 = float1;
        double double3 = byte2;
        double double4 = long3;
        double double5 = 333;

        // 참조형: class, interpace
        String str1 = new String("hi");
        str1 = "hi";

        String str2 = new String("hi");

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2: " + bool4);
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
    }
}
