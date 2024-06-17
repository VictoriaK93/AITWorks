package date_time_formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormat {
    public static void main(String[] args) {
        LocalDate gagarinStart = LocalDate.of(1961,04,12);

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarinStart.format(df));


        System.out.println("-----------------------------");
        df = DateTimeFormatter.ofPattern("dd MMM yy", Locale.ENGLISH );
        System.out.println(gagarinStart.format(df));


        System.out.println("================parsing date from string====================");
        String str = "10 06 2024";
        System.out.println(str);

        System.out.println("---------------------------------");
        LocalDate date = dateParse(str); // этот метод должен извлечь из строки дату
        System.out.println(date + " " + date.getDayOfWeek());
        System.out.println(date.getDayOfWeek());


    }
//  извлекает из строки дату по формату, в формате ISO текстовому
    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(" [dd MM yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy]");
        return LocalDate.parse(date, df);

    }
}
