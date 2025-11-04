package application.command.camp;

import application.command.Command;
import application.services.CampService;
import infrastructure.repository.InMemoryCampRepository;

import java.util.Scanner;

public class DeleteCampCommand implements Command {
    private final CampService campService;

    public DeleteCampCommand(CampService campService) {
        this.campService = campService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID кемпа, который хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int campId = scanner.nextInt();
        campService.deleteCamp(campId);
    }
}
