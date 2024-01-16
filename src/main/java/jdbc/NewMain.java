package jdbc;

import java.sql.SQLException;

public class NewMain {
    public static void main(String[] args)  throws SQLException {
        CarService carService = new CarService(new Service());
        carService.getAuto();
    }
}


