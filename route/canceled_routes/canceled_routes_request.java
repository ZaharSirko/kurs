package  route.canceled_routes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class canceled_routes_request {
    public List<canceled_routes_model> getAllCanceledRoutes() throws SQLException {
        List<canceled_routes_model> canceledRoutes = new ArrayList<>();
 
        List<canceled_routes> canceledRouteList = new canceled_routes_DAO().getAllCanceledRoutes();

        for (canceled_routes canceledRoute : canceledRouteList) {
            canceled_routes_model canceledRouteModel = new canceled_routes_model(
                    canceledRoute.getId(),
                    canceledRoute.getFrom(),
                    canceledRoute.getDirection(),
                    canceledRoute.getTo(),
                    canceledRoute.getCanceled_routes_id(),
                    canceledRoute.getCanceled_routes_type()
            );

            canceledRoutes.add(canceledRouteModel);
        }

        return canceledRoutes;
        
    }
    
}
