package Test;

import java.time.LocalDate;

public class Test1 {
	public static void main (){
        LocalDate date = LocalDate.of(2003,9,9);
        System.out.println(date.getDayOfWeek());
    }
}

