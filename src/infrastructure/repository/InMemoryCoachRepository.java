package infrastructure.repository;

import domain.model.Coach;
import domain.repository.CoachRepository;

import java.util.HashMap;

public class InMemoryCoachRepository implements CoachRepository {
    HashMap<Integer, Coach> coaches = new HashMap<>();

    @Override
    public void addCoach(Coach coach) {
        coaches.put(coach.getCoach_id(), coach);
    }

    @Override
    public Coach findCoachById(int coachId) {
        return coaches.get(coachId);
    }

    @Override
    public void updateCoach(Coach updatedCoach) {
        coaches.put(updatedCoach.getCoach_id(), updatedCoach);
    }

    @Override
    public void deleteCoach(int coachId) {
        coaches.remove(coachId);
    }
}
