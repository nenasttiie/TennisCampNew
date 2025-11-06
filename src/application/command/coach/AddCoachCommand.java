package application.command.coach;

import application.command.Command;
import application.services.CampService;
import application.services.CoachService;
import domain.model.Coach;
import infrastructure.repository.InMemoryCoachRepository;

import java.util.Scanner;

public class AddCoachCommand implements Command {
    private final CoachService coachService;

    public AddCoachCommand(CoachService coachService) {
        this.coachService = coachService;
    }

    @Override
    public void execute() {
        System.out.println("Введите данные тренера:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID тренера:");
        int coachId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите ID кемпа:");
        int campId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите фамилию тренера:");
        String surname = scanner.nextLine();

        System.out.println("Введите имя тренера:");
        String name = scanner.nextLine();

        System.out.println("Введите разряд тренера:");
        String category = scanner.nextLine();

        Coach coach = new Coach(coachId, campId, surname, name, category);

        coachService.addCoach(coach);
    }
}
