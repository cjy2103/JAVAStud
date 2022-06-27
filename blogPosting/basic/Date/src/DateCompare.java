import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {

    private Date today;
    private String compareDate = "2022/06/21";

    public DateCompare() {
        today = new Date();
    }

    public void compareDate() throws ParseException {
        Date format = new SimpleDateFormat("yyyy/MM/dd").parse(compareDate);

        long diffSec = (today.getTime() - format.getTime()) / 1000; // 초 차이
        long diffMin = (today.getTime() - format.getTime()) / 60000; // 분 차이
        long diffHor = (today.getTime() - format.getTime()) / 360000; // 시 차이
        long diffDays = diffSec / (24*60*60); // 일 차이

        System.out.println(diffSec + "초 차이");
        System.out.println(diffMin + "분 차이");
        System.out.println(diffHor + "시간 차이");
        System.out.println(diffDays + "일 차이");

        if(diffDays >5){
            System.out.println("5일 이상 차이남");
        }

    }
}
