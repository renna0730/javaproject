package chapther06;

public class ForTest4 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i  = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1~" + n + "까지의 합계는 " + sum + "이다.");
    }
}
