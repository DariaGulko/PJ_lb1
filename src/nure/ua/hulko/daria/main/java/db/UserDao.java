package nure.ua.hulko.daria.main.java.db;

import nure.ua.hulko.daria.main.java.User;

import java.util.Collection;

/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public interface UserDao {
    User create(User user) throws DatabaseException;
    void update(User user) throws DatabaseException;;
    void delete(User user) throws DatabaseException;;
    User find(Long id) throws DatabaseException;;
    Collection findAll() throws DatabaseException;;
    public void setConnectionFactory(ConnectionFactory connectionFactory);
}
