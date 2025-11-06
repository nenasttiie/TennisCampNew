package application.command.coach;

import application.command.Command;
import application.services.CoachService;
import infrastructure.repository.InMemoryCoachRepository;

import java.util.Scanner;

public class DeleteCoachCommand implements Command {
    private final CoachService coachService;

    public DeleteCoachCommand(CoachService coachService) {
        this.coachService = coachService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID тренера, которого хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int coachId = scanner.nextInt();
        coachService.deleteCoach(coachId);
    }
}
