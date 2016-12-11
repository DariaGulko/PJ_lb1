package nure.ua.hulko.daria.main.java.util;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
/**
 * Created by Darusya Gulko on 12.12.2016.
 */
public class Messages{
        private static final String BUNDLE_NAME = "messages";
        private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

        private Messages(){}

        public static String getString(String key) {
            try {
                return RESOURCE_BUNDLE.getString(key);
            } catch (MissingResourceException e) {
                return '!' + key + '!';
            }
        }
}
