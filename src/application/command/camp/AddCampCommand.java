package application.command.camp;

import application.command.Command;
import application.services.CampService;
import domain.model.Camp;
import infrastructure.repository.InMemoryCampRepository;

import java.util.Scanner;

public class AddCampCommand implements Command {
    private final CampService campService;

    public AddCampCommand(CampService campService) {
        this.campService = campService;
    }
    @Override
    public void execute() {
        System.out.println("Введите данные кемпа:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID кемпа:");
        int campId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите название кемпа:");
        String campName = scanner.nextLine();

        System.out.println("Введите даты кемпа:");
        String dates = scanner.nextLine();

        System.out.println("Введите страну:");
        String country = scanner.nextLine();

        System.out.println("Введите стоимость кемпа:");
        String cost = scanner.nextLine();

        System.out.println("Введите корты:");
        String courts = scanner.nextLine();

        Camp camp = new Camp(campId, campName, dates, country, cost, courts);
        campService.addCamp(camp);
    }
}
