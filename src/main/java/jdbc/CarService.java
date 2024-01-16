package jdbc;


import java.sql.SQLException;
import java.util.List;
class CarService {
    private Service service;

    public CarService(Service service) {
        this.service = service;
    }

    public void getAuto() throws SQLException {
        List<Auto> autos = service.Auto();
        for (Auto auto : autos) {
            System.out.println(auto.getId() + "\t" + auto.getBrand() + "\t" + auto.getModel() + "\t" +  auto.getEngine_volume() + "\t" + auto.getPrice() + "\t" + auto.getMax_speed());
        }
    }
}










