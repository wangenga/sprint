import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate weekdayDate = LocalDate.of(2024, 8, 26);
        LocalDate weekendDate = LocalDate.of(2024, 8, 31);
        LocalDate wednesdayDate = LocalDate.of(2024, 8, 28);
        System.out.println(DayChecker.checkDayType(weekdayDate));
        System.out.println(DayChecker.checkDayType(weekendDate));
        System.out.println(DayChecker.checkDayType(wednesdayDate));
    }

}