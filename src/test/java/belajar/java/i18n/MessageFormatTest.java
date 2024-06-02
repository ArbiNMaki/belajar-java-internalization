package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        String pattern = "Hi {0}, Anda bisa mencari data anda dengan mengetik \"{0}\" di pencarian.";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"Arbi"});
        System.out.println(format);
    }

    @Test
    void testMessageProperties() {
        Locale indonesia = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);
        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"Arbi", "Belajar java i18n"});
        System.out.println(format);
    }
}
