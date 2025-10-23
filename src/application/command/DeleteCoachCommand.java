package application.command;

import infrastructure.repository.InMemoryCoachRepository;

import java.util.Scanner;

public class DeleteCoachCommand implements Command {
    private final InMemoryCoachRepository theCoachRepository;

    public DeleteCoachCommand(InMemoryCoachRepository coachRepository) {
        this.theCoachRepository = coachRepository;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID тренера, которого хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int coachId = scanner.nextInt();
        theCoachRepository.deleteCoach(coachId);
    }
}
