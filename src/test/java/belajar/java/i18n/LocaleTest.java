package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testNewLocale() {
        var language = "id";
        var country = "ID";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUs() {
        var language = "en";
        var country = "US";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
