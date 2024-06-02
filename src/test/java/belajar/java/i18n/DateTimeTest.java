package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatI18NIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("in", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatI18NJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("in", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Rabu 03 Juni 2024");
            System.out.println(date);
        }
        catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }
}
