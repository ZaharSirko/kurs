package  train;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import _connection._connection;


public class train_request extends _connection {
    public List<train_model> getAllTrainRoute() throws SQLException {
        List<train_model> Train = new ArrayList<>();
 
        List<train> TrainList = new train_DAO().getAllTrainsRoutes();

        for (train Trains : TrainList) {
            train_model TrainModel = new train_model(
                Trains.getTrain_id(),
                Trains.getId(),
                Trains.getTrain_name(),
                Trains.getRoutes_ticket_price(),
                Trains.getRoutes_duration(),
                Trains.getFrom(),
                Trains.getDirection(),
                Trains.getTo()
            );

            Train.add(TrainModel);
        }

        return Train;
    }
    }
