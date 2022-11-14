
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        new Test1();
        Long a = 510521_20001002_7932L;
        System.out.println(a);
        new Test1().test2();
        String s2="hello world";
        String s1 ="hello world";
        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2) +" equals方法");
        String s3 = new String("hello world");
        String s4 = new String("hello world");
        System.out.println(s3 == s4 );
        boolean s = s1 == "hello world";
        System.out.println(s + "---------->");
        System.out.println(s3.equals(s4) +" equals方法");
        System.out.println(s3.equals("hello world") +" equals方法");

        Integer value = 308;
        int x = value;
        System.out.println(x);
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        Date date = new Date();
        System.out.println(now);
        System.out.println(date);
        System.out.println(now1);
        System.out.println(LocalDateTime.now());
        String in = "20180709";
        String in1 = "2018-07-09";
        LocalDate dateTime = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date1 = LocalDate.parse(in1);
        System.out.println(dateTime);
        System.out.println(date1);
        int i = 0b1011;
        System.out.println(i);
    }
}