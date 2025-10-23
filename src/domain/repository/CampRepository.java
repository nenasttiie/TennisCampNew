package domain.repository;

import domain.model.Camp;

public interface CampRepository {
    void addCamp(Camp camp);

    Camp findCampById(int campId);

    void updateCamp(Camp updatedCamp);

    void deleteCamp(int campId);
}
