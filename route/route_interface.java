package  route;

import java.sql.SQLException;
import java.util.List;

public interface route_interface {
    List<route> getAllRoutes() throws SQLException;
    void addRoutes(route routes);
    void updateRoutes(route routes);
    void deleteRoutes(int id);
    
}
