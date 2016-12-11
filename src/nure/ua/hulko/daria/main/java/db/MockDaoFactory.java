package nure.ua.hulko.daria.main.java.db;
import com.mockobjects.dynamic.Mock;
/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public class MockDaoFactory extends DaoFactory {

    private Mock mockUserDao;

    public MockDaoFactory() {
        mockUserDao = new Mock(UserDao.class);
    }

    public Mock getMockUserDao() {
        return mockUserDao;
    }

    @Override
    public UserDao getUserDao() {
        return (UserDao) mockUserDao.proxy();
    }
}
