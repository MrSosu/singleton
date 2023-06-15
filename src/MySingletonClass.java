import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySingletonClass {

    private static MySingletonClass istance = null;
    private String url = "lamiaurl";
    private String username = "user";
    private String password = "password";

    private MySingletonClass() {

    }

    public static MySingletonClass getInstance() {
        if (istance == null) {
            istance = new MySingletonClass();
        }
        return istance;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
