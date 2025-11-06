package infrastructure.repository;

import domain.model.Camp;
import domain.repository.CampRepository;

import java.util.HashMap;

public class InMemoryCampRepository implements CampRepository {
    HashMap<Integer, Camp> camps = new HashMap<>();
    @Override
    public void addCamp(Camp camp) {
        camps.put(camp.getCampId(), camp);
    }

    @Override
    public Camp findCampById(int campId) {
        return camps.get(campId);
    }

    @Override
    public void updateCamp(Camp updatedCamp) {
        camps.put(updatedCamp.getCampId(), updatedCamp);
    }

    @Override
    public void deleteCamp(int campId) {
        camps.remove(campId);
    }
}
