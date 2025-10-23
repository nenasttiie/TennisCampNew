import domain.model.Coach;
import infrastructure.repository.InMemoryCoachRepository;

public class Main {
    public static void main(String[] args) {
        InMemoryCoachRepository coachRepository = new InMemoryCoachRepository();
        coachRepository.addCoach(new Coach(1, 1, "Startsev", "Dmitriy", "Master of Sports"));
        coachRepository.addCoach(new Coach(2, 1, "Ivanov", "Ivan", "Master of Sports"));

        System.out.println("Тренер 1: " + coachRepository.findCoachById(1));
        System.out.println("Тренер 2: " + coachRepository.findCoachById(2));
    }
}