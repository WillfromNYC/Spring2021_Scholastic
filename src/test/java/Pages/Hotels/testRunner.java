package Pages.Hotels;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

@Test
public class testRunner {

    Date currentDate = new Date();
    SimpleDateFormat fMonth = new SimpleDateFormat("MMM");
    SimpleDateFormat fDay = new SimpleDateFormat("dd");
    SimpleDateFormat fYear = new SimpleDateFormat("yyyy");

    SimpleDateFormat fMonthYear = new SimpleDateFormat("MMM yyyy");

    String fMonthString = fMonth.format(currentDate);
    String fDayString = fDay.format(currentDate);
    String fYearString = fYear.format(currentDate);

    String fDayAdjusted = "";
    String fMDY = "";
    String fDay28 = "28";

    int fMonthInt = Integer.valueOf(fDayString);
    int fDayInt = Integer.valueOf(fDayString);
    int fYearInt = Integer.valueOf(fDayString);

    String fMonthYearString = fMonthYear.format(currentDate);

    public void checkDaysBefore(){
        System.out.println(fDayInt);

        if ((fMonthInt==1) && (fDayInt==1)){//if month is Jan then need to change date to Dec, 28, and (year - 1)
            fYearInt = fYearInt - 1;
            fYearString = String.valueOf(fYearInt);
            fMDY = "12"+ " " + fDay28 + " " + fYearString;


        } else if((fMonthInt>=2) && (fDayInt==1)) {//if day = 1 then need to lower month, but also is Feb or above
            fMonthInt = fMonthInt - 1;
            fMonthString = String.valueOf(fMonthInt);
            fMDY = fMonthInt+" " + fDay28 + " " + fYearString;

        } else if(fDayInt>=2) {
            fDayInt = fDayInt - 1;
            fDayAdjusted = String.valueOf(fDayInt);
            fMDY = fMonthString+" " + fDayAdjusted + " " + fYearString;
        }
        System.out.println("fMDY= " + fMDY);
    }
}
