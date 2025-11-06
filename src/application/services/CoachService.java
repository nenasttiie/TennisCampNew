package application.services;

import domain.model.Coach;
import infrastructure.repository.InMemoryCoachRepository;

public class CoachService {
    private final InMemoryCoachRepository coachRepository;

    public CoachService(InMemoryCoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public void addCoach(Coach coach){
        coachRepository.addCoach(coach);
    }

    public Coach findCoachById(int coachId){
        return coachRepository.findCoachById(coachId);
    }

    public void updateCoach(Coach updatedCoach){
        coachRepository.updateCoach(updatedCoach);
    }

    public void deleteCoach(int coachId){
        coachRepository.deleteCoach(coachId);
    }
}
