package application.command.camp;

import application.command.Command;
import application.services.CampService;
import infrastructure.repository.InMemoryCampRepository;

import java.util.Scanner;

public class FindCampByIdCommand implements Command {
    private final CampService campService;

    public FindCampByIdCommand(CampService campService) {
        this.campService = campService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID кемпа, который хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int campId = scanner.nextInt();
        System.out.println(campService.findCampById(campId));
    }
}
