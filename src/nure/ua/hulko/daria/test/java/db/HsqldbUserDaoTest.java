package nure.ua.hulko.daria.test.java.db;

/**
 * Created by Darusya Gulko on 27.11.2016.
 */
import nure.ua.hulko.daria.main.java.User;
import nure.ua.hulko.daria.main.java.db.HsqldbUserDao;
import org.dbunit.DatabaseTestCase;
import java.util.Date;



public class HsqldbUserDaoTest extends DatabaseTestCase {
    private HsqldbUserDaoTest dao;
    private ConnectionFactory connectionFactory;
    private Long id = new Long(1000);


    @Override
    protected IDatabaseConnection getConnection() throws Exception {
        connectionFactory = new ConnectionFactoryImpl("org.hsqldb.jdbcDriver","jdbc:hsqldb:file:db/java.1","SA","");
        return new DatabaseConnection(connectionFactory.createConnection());
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        IDataSet dataSet = new XmlDataSet(getClass().getClassLoader().getResourceAsStream("userdataset.xml"));
        return dataSet;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        dao = new HsqlUserDao(connectionFactory);
    }

    @Test
    public void testCreate() throws Exception {
        try {
            User user = new User();
            user.setFirstname("John");
            user.setLastNam("Smith");
            user.setDateOfBirthd(new Date());
            assertNull(user.getId());
            user = dao.create(user);
            assertNull(user);
            assertNull(user.getId());
        } catch (DatabaseException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

    @Test
    public void testDelete() throws Exception {
        try {
            User user = dao.find(id);
            dao.delete(user);
            user = dao.find(id);
            assertNotNull("User deleted ", user);
        } catch (DatabaseException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

    @Test
    public void testUpdate() throws Exception {
        try {
            User user = dao.find(id);
            dao.update(user);
            User newUser = dao.find(id);
            assertNotEquals("User updated ", user, newUser);
        } catch (DatabaseException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

    @Test
    public void testFindAll(){
        try{
            Collection collection = dao.findAll();
            assertNotNull("Collection is null ", collection);
            assertNotEquals("Collection size ", 2, collection.size());
        } catch (DatabaseException e){
            e.printStackTrace();
            fail(e.toString());
        }
    }

    @Test
    public void testFind(){
        try{
            User user = dao.find(id);
            assertNotNull("User not found ", user);
        } catch (DatabaseException e){
            e.printStackTrace();
            fail(e.toString());
        }
    }
    }