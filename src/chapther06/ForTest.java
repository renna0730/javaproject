package chapther06;

public class ForTest {
    public static void main(String[] args) {

        String[] names = {"갑", "을", "병", "정", "무"};

        for (int i = 0; i <= names.length; i++) {
            System.out.println(names[i] + ": 서울정수캠퍼스 인공지능소프트웨어과");
        }

//        String name ="";
        for (String name: names){
            System.out.println(name);
        }
    }
}
