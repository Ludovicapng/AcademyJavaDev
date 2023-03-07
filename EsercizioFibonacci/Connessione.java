package EsercizioFibonacci;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connessione {

    private String myUrl;
    private String myUser;
    private String myPassword;

    public Connessione(String url, String user, String password) {
        myUrl = url;
        myUser = user;
        myPassword = password;
    }

    public Connection CreaConnessione() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);

            System.out.println(conn == null ? "Connessione non riuscita" : "Connessione avvenuta" );

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}