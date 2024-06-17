package homework_36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormatBirthday {
    public static void main(String[] args) {
        LocalDate dateofBirth = LocalDate.of(1993, 12, 9);
        System.out.println(dateofBirth.getDayOfYear());
        System.out.println(dateofBirth.getDayOfMonth());
        System.out.println(dateofBirth.getDayOfWeek());

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(dateofBirth.format(df));

        System.out.println("------------------------------");

        df = DateTimeFormatter.ofPattern("dd MMMM yy", Locale.ENGLISH);
        System.out.println(dateofBirth.format(df));

    }
}
