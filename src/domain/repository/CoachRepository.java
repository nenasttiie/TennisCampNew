package domain.repository;

import domain.model.Coach;

public interface CoachRepository {
    void addCoach(Coach coach);

    Coach findCoachById(int coachId);

    void updateCoach(Coach updatedCoach);

    void deleteCoach(int coachId);
}
