package nure.ua.hulko.daria.main.java.db;

import java.sql.Connection;
/**
 * Created by Darusya Gulko on 24.11.2016.
 */
public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
