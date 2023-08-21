import java.sql.*;

public class DbOperationsPerform implements DbOperations{
    private Connection connection = Database.connect();
    @Override
    public  void read() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(Query.read);
        while (resultSet.next()){
            System.out.println("ID : "+resultSet.getInt(1));
            System.out.println("NAME : "+ resultSet.getString(2));
        }
        statement.close();
    }

    @Override
    public void create() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(Query.create);
        statement.setInt(1,10);
        statement.setString(2,"sayan karmakar");
        System.out.println("data inserted done !!!");
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public void update() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(Query.update);
        statement.setString(1,"mr.sayan roy");
        statement.setInt(2,10);
        int i = statement.executeUpdate();
        System.out.println("updated" + i);
        statement.close();

    }

    @Override
    public void delete() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(Query.delete);
        statement.setInt(1,10);
        statement.execute();
        System.out.println("deleted ");
        statement.close();
    }
}
