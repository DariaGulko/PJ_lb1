package nure.ua.hulko.daria.test.java.db;
import nure.ua.hulko.daria.main.java.User;
import nure.ua.hulko.daria.main.java.db.ConnectionFactory;
import nure.ua.hulko.daria.main.java.db.DatabaseException;
import nure.ua.hulko.daria.main.java.db.UserDao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public class MockUserDao implements UserDao {

    private long id = 0;
    private Map users = new HashMap();

    @Override
    public User create(User user) throws DatabaseException {
        Long currentId = new Long(++id);
        user.setId(currentId);
        users.put(currentId, user);
        return user;
    }

    @Override
    public void update(User user) throws DatabaseException {
        Long currentId = user.getId();
        users.remove(currentId);
        users.put(currentId, user);
    }

    @Override
    public void delete(User user) throws DatabaseException {
        Long currentId = user.getId();
        users.remove(currentId);
    }

    @Override
    public User find(Long id) throws DatabaseException {
        return (User) users.get(id);
    }

    @Override
    public Collection findAll() throws DatabaseException {
        return users.values();
    }

    @Override
    public void setConnectionFactory(ConnectionFactory connectionFactory) {

    }
}

