package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyJapan() {
        Locale japan = new Locale("ja", "JP");
        Currency currency = Currency.getInstance(japan);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(japan));
    }

    @Test
    void testCurrencyNumberFormat() {
        Locale indonesia = new Locale("in", "ID");
        Locale japan = new Locale("ja", "JP");

        NumberFormat formatIndonesia = NumberFormat.getCurrencyInstance(indonesia);
        NumberFormat formatJapan = NumberFormat.getCurrencyInstance(japan);
        var format = formatIndonesia.format(10000000.255);
        var format2 = formatJapan.format(10000000.255);

        System.out.println(format);
        System.out.println(format2);
    }

    @Test
    void testCurrencyParse() {
        Locale indonesia = new Locale("in", "ID");
        Locale japan = new Locale("ja", "JP");

        NumberFormat formatIndonesia = NumberFormat.getCurrencyInstance(indonesia);
        NumberFormat formatJapan = NumberFormat.getCurrencyInstance(japan);

        try {
            var value = formatIndonesia.parse("Rp1.000.000,255").doubleValue();
            var value2 = formatJapan.parse("￥10,000,000").doubleValue();

            System.out.println(value);
            System.out.println(value2);
        } catch (ParseException e) {
            System.out.println("Error parsing : " + e.getMessage());
        }
    }
}
