import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(formatDate(date));

    }

    public static String formatDate(OffsetDateTime dateTime) {
        if(dateTime != null) {
            return dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        } else {
            return null;
        }
    }
}
