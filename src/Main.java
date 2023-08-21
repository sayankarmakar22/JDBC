import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbOperationsPerform db = new DbOperationsPerform();

        db.create();
        db.read();
        db.update();
        db.delete();

    }
}