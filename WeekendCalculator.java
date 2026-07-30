package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCalculator {
    public long countWeekendDays(LocalDate x, LocalDate y){
       long weekend = 0;
       
       
        if (x .isAfter(y)){
            LocalDate temp = x;
            x = y;
            y = temp;
        }
        
        LocalDate currentDate  = x;

        while (!currentDate.isAfter(y)) {
            if (isWeekend(currentDate)){
                weekend++;
            }
        }
        return weekend;
    }

    private static boolean isWeekend(LocalDate day){
        DayOfWeek typeDay = day.getDayOfWeek();

        return typeDay == DayOfWeek.SATURDAY || typeDay == DayOfWeek.SUNDAY;
    }
    
}
