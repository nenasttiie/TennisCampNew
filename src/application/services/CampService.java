package application.services;

import domain.model.Camp;
import infrastructure.repository.InMemoryCampRepository;

public class CampService {
    private final InMemoryCampRepository theCampRepository;

    public CampService(InMemoryCampRepository campRepository) {
        this.theCampRepository = campRepository;
    }

    public void addCamp(Camp camp){
        theCampRepository.addCamp(camp);
    }

    public Camp findCampById(int campId){
        return theCampRepository.findCampById(campId);
    }

    public void updateCamp(Camp updatedCamp){
        theCampRepository.updateCamp(updatedCamp);
    }

    public void deleteCamp(int campId){
        theCampRepository.deleteCamp(campId);
    }
}
