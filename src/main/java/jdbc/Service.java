package jdbc;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Service {
    public static Connection connection;
    public static final String URL = "jdbc:mysql://localhost:3306/Carsshop1?serverTimeZone=Europe/Kiev";
    public static final String USER = "root";
    public static final String PASSWORD = "3214";

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    public static List<Auto> Auto() throws SQLException {
        String query = "SELECT * FROM auto";
        Statement statement = getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        List<Auto> autos = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            Double engine_volume = resultSet.getDouble("engine_volume");
            int price = resultSet.getInt("price");
            int max_speed = resultSet.getInt("max_speed");

            Auto auto = new Auto(id, brand, model, engine_volume, price, max_speed);
            autos.add(auto);
        }
        resultSet.close();
        statement.close();
        return autos;
    }
}

