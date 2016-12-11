package nure.ua.hulko.daria.test.java;

import nure.ua.hulko.daria.main.java.User;
import org.junit.Test;

/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public class DbTest extends junit.framework.TestCase {
    @Test
    public void createTest(){
        User user =new User();
        user.setFirstName("Daisy");
        user.setLastName("Gulko");
        //user.setDateOfBirth(1999/12/10,11);
    }
}
