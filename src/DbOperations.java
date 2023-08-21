import java.sql.SQLException;

interface DbOperations {
    void read() throws SQLException;
    void create() throws SQLException;
    void update() throws SQLException;
    void delete() throws SQLException;
}
