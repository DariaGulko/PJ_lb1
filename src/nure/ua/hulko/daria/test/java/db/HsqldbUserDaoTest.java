package nure.ua.hulko.daria.test.java.db;

/**
 * Created by Darusya Gulko on 27.11.2016.
 */
import nure.ua.hulko.daria.main.java.User;
import nure.ua.hulko.daria.main.java.db.HsqldbUserDao;
import org.dbunit.DatabaseTestCase;
import java.util.Date;



public class HsqldbUserDaoTest extends DatabaseTestCase {
    private HsqldbUserDao dao;


    public void testCreate(){
        try{
            User user = new User();
            user.setFirstName("Daisy");
            user.setLastName("Gullko");
            user.setDateOfBirth(new Date());
            assertNull(user.getId());


        }catch (DatabaseException e) {
            e.printStackTrace();
            fail(e.toString());
    }
}