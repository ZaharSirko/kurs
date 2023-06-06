package  passengers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import _connection._connection;

public class passengers_request extends _connection {
    public List<passengers_model> getAllPassenger() throws SQLException {
        List<passengers_model>  Passengers = new ArrayList<>();
        
        List<passengers> PassengersList = new passengers_DAO().getAllPassengers();

        for (passengers  Passenger :  PassengersList) {
            passengers_model  PassengerModel = new passengers_model(
                Passenger.getId(),
                Passenger.getSurename(),
                Passenger.getName(),
                Passenger.getAge(),
                Passenger.getGender(),
                Passenger.getRoutes_to()
            );

            Passengers.add(PassengerModel);
        }

        return  Passengers;
    }
}
