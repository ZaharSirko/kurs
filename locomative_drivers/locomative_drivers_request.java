package  locomative_drivers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class locomative_drivers_request  {
    public List<locomative_drivers_model> getAllLocamativeDrivers() throws SQLException {
        List<locomative_drivers_model>  LocomativeDriver = new ArrayList<>();
        
        List<locomative_drivers> LocomativeDriverList = new locomative_drivers_DAO().getAllLocomativeDrivers();

        for (locomative_drivers  LocomativeDrivers :  LocomativeDriverList) {
            locomative_drivers_model  LocomativeDriverModel = new locomative_drivers_model(
                LocomativeDrivers.getId(),
                LocomativeDrivers.getSurename(),
                LocomativeDrivers.getName(),
                LocomativeDrivers.getGender(),
                LocomativeDrivers.getAge(),
                LocomativeDrivers.getWorkExperience(),
                LocomativeDrivers.getSalary(),
                LocomativeDrivers.getMedical_examination_2022(),
                LocomativeDrivers.getMedical_examination_2023()
            );

            LocomativeDriver.add(LocomativeDriverModel);
        }

        return  LocomativeDriver;
    }
}
