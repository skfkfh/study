package study.demo.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DateUtil {

    public List<String> getDateYyyyMmDdHhMm() {
        LocalDateTime now = LocalDateTime.now();

        String yyyy = String.valueOf(now.getYear());
        String mm = String.format("%02d", now.getMonthValue());
        String day = String.format("%02d", now.getDayOfMonth());
        String hour = String.format("%02d", now.getHour());
        String minute = String.format("%02d", now.getMinute());

        List<String> dateList = new ArrayList<>();
        dateList.add(yyyy);
        dateList.add(mm);
        dateList.add(day);
        dateList.add(hour);
        dateList.add(minute);

        return dateList;
    }
}
