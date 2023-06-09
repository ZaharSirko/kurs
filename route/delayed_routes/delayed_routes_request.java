package  route.delayed_routes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class delayed_routes_request {
    public List<delayed_routes_model> getAllDelayedRoutes() throws SQLException {
        List<delayed_routes_model> DelayedRoutes = new ArrayList<>();
 
        List<delayed_routes> DelayedRouteList = new delayed_routes_DAO().getAllDelayedRoutes();

        for (delayed_routes DelayedRoute : DelayedRouteList) {
            delayed_routes_model DelayedRouteModel = new delayed_routes_model(
                DelayedRoute.getDelayed_routes(),    
                 DelayedRoute.getId(),
                 DelayedRoute.getFrom(),
                DelayedRoute.getDirection(),
                DelayedRoute.getTo(),
                DelayedRoute.getDelayed_routes_reason()
            );

            DelayedRoutes.add(DelayedRouteModel);
        }

        return DelayedRoutes;
    }
}
