import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    void format_date() {
        String result = Main.formatDate(date);
        assertEquals("01 marzo 2023", result);
    }

}