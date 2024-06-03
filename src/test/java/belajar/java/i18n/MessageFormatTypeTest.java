package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatType() {
        Locale indonesia = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);
        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        String format = messageFormat.format(new Object[]{"Arbi", new Date(), 1000000000});
        System.out.println(format);
    }
}
