package nure.ua.hulko.daria.main.java.db;

/**
 * Created by Darusya Gulko on 11.12.2016.
 */
public class DatabaseException extends Exception {
    public DatabaseException(Throwable cause) {
        super(cause);
    }

    public DatabaseException() {
        super();
    }

    public DatabaseException(String message) {
        super(message);
    }
}

