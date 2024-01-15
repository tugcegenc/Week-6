import java.sql.*;

public class Main {

    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        Connection connection = null;


        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connection.createStatement();
            String sql = "INSERT INTO employees (name,position,salary) VALUES (?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "Penelope Guiness");
            preparedStatement.setString(2, "Doctor");
            preparedStatement.setInt(3, 10000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Ed Chase");
            preparedStatement.setString(2, "Actor");
            preparedStatement.setInt(3, 20000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Jennifer Davis");
            preparedStatement.setString(2, "Police");
            preparedStatement.setInt(3, 8000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Joe Swank");
            preparedStatement.setString(2, "Teacher");
            preparedStatement.setInt(3, 8000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Karl Berry");
            preparedStatement.setString(2, "Finance Expert");
            preparedStatement.setInt(3, 15000);
            preparedStatement.executeUpdate();

            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            System.out.println("--EMPLOYEE LIST--");
            while (resultSet.next()) {
                System.out.println("------------------");
                System.out.println("Employee ID: " + resultSet.getInt("id"));
                System.out.println("Employee Name: " + resultSet.getString("name"));
                System.out.println("Employee Position: " + resultSet.getString("position"));
                System.out.println("Employee Salary: " + resultSet.getInt("salary"));

            }

            preparedStatement.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
}