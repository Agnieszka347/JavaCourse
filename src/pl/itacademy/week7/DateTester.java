package pl.itacademy.week7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(now));
        Date anotherDay = format.parse("2019-12-31");
        System.out.println(anotherDay);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, 1);
        Date changedDate = calendar.getTime();
        System.out.println(changedDate);
        SimpleDateFormat anotherFormat = new SimpleDateFormat("MMMM-EEEE");
        System.out.println(anotherFormat.format(changedDate));

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        LocalDateTime dateWithTime = LocalDateTime.now();
        System.out.println(dateWithTime);

        LocalDate incrementedDate = today.plus(10, ChronoUnit.DAYS);
        System.out.println(incrementedDate);

        LocalDate anotherDate = LocalDate.parse("2019-12-31");
        System.out.println(anotherDate);
        anotherDate = LocalDate.of(2019, 12, 31);
        System.out.println(anotherDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse("01-01-2020", formatter);
        System.out.println(parsedDate);

        Date dateToday = new Date();
        LocalDateTime localTime = dateToday.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        Date from = Date.from(localTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}