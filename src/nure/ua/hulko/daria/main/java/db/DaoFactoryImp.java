package nure.ua.hulko.daria.main.java.db;

/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public class DaoFactoryImp extends DaoFactory {
    public UserDao getUserDao(){
        UserDao result = null;
        try {
            Class clasz = Class.forName(properties.getProperty(USER_DAO));
            result = (UserDao) clasz.newInstance();
            result.setConnectionFactory(getConnectionFactory());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
