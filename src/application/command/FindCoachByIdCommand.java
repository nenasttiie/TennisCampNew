package application.command;

import infrastructure.repository.InMemoryCoachRepository;

import java.util.Scanner;

public class FindCoachByIdCommand implements Command {
    private final InMemoryCoachRepository theCoachRepository;

    public FindCoachByIdCommand(InMemoryCoachRepository coachRepository) {
        this.theCoachRepository = coachRepository;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID тренера, которого хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int coachId = scanner.nextInt();
        System.out.println(theCoachRepository.findCoachById(coachId));
    }
}
