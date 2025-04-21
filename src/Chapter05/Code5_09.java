package Chapter05;

import java.util.Calendar;

public class Code5_09 {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        int day = calender.get(Calendar.DAY_OF_WEEK); //요일을 0부터 6까지 반환

        System.out.println("현재 요일을 번호: " + day); // 2출력시, 일요일이 1
        char dayCh = 0;

        switch (day) {
            case Calendar.SUNDAY: dayCh = '일';
            break;
            case Calendar.MONDAY: dayCh = '월';
            break;
            case Calendar.TUESDAY: dayCh = '화';
                break;
            case Calendar.WEDNESDAY: dayCh = '수';
                break;
            case Calendar.THURSDAY: dayCh = '목';
                break;
            case Calendar.FRIDAY: dayCh = '금';
                break;
            case Calendar.SATURDAY: dayCh = '토';
                break;
        }
        System.out.println("오늘은 " + dayCh + "요일입니다.");

    }
}
