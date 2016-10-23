package nure.ua.hulko.daria.test.java;

import nure.ua.hulko.daria.main.java.User;

import java.security.PrivateKey;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Darusya Gulko on 23.10.2016.
 */
public class UserTest extends junit.framework.TestCase {

    private User user;
    private Date dateOfBirth;

    @org.junit.Before
    public void setUp() throws Exception {
        super.setUp();
        user = new User();
        dateOfBirth=new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(1997, Calendar.JULY, 12);
        dateOfBirth= calendar.getTime();

    }
    public void testGetFullName(){
        user.setFirstName("Name1");
        user.setLastName("LastName1");
        assertEquals("LastName1,Name1",user.getFullName());
    }
    public void testGetAge(){
        user.setDateOfBirth(dateOfBirth);
        assertEquals(2016-1997,user.getAge());
    }

}