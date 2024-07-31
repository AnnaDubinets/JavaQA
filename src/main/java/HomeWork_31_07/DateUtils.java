package HomeWork_31_07;

public class DateUtils {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is leap year: " + isLeapYear(year));
    }
}
