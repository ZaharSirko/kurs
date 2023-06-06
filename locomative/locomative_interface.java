package  locomative;

import java.util.List;

public interface locomative_interface {
    List<locomative> getAllLocomative();
    void addLocomative(locomative Locomative);
    void updateLocomative(locomative Locomative);
    void deleteLocomative(int id);
}
