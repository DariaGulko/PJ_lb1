package nure.ua.hulko.daria.main.java.db;

import nure.ua.hulko.daria.main.java.User;

import java.util.Collection;

/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public interface UserDao {
    User create(User user) throws DatabaseException;
    void update(User user);
    void delete(User user);
    User find(Long id);
    Collection findAll();
}
