//package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayChecker {
    public static String checkDayType(LocalDate y){
        
        DayOfWeek typeDay = y.getDayOfWeek(); 
        
        switch (typeDay) {

            case SUNDAY: 
            case SATURDAY:
                return "Weekend";
            case MONDAY:
            case TUESDAY:
            case THURSDAY:
            case FRIDAY: 
                return "Weekday";
            case WEDNESDAY:
                return "Hump Day!";
            default:
                return "unknown";
        }
                      
    }
}

