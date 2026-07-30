import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 8, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 31);
        WeekendCalculator calculator = new WeekendCalculator();
        long weekendDayCount = calculator.countWeekendDays(startDate, endDate);
        System.out.println(weekendDayCount);
    }

}