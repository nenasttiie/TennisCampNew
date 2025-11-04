package application.command.camp;

import application.command.Command;
import application.services.CampService;
import domain.model.Camp;
import infrastructure.repository.InMemoryCampRepository;

import java.util.Scanner;

public class UpdateCampCommand implements Command {
    private final CampService campService;

    public UpdateCampCommand(CampService campService) {
        this.campService = campService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID кемпа, данные которого надо изменить: ");
        Scanner scanner = new Scanner(System.in);

        int campId = scanner.nextInt();
        scanner.nextLine();
        Camp camp = campService.findCampById(campId);
        String flag;

        String campName = camp.getCamp_name();
        System.out.println("Менять название кемпа?");
        flag = scanner.nextLine();

        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новое название кемпа: ");
            campName = scanner.nextLine();
        }

        String dates = camp.getDates();
        System.out.println("Менять даты?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новые даты: ");
            dates = scanner.nextLine();
        }

        String country = camp.getCountry();
        System.out.println("Менять страну?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новая страна: ");
            country = scanner.nextLine();
        }

        String cost = camp.getCost();
        System.out.println("Менять стоимость?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новая стоимость: ");
            cost = scanner.nextLine();
        }

        String courts = camp.getCost();
        System.out.println("Менять корты?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новые корты: ");
            courts = scanner.nextLine();
        }

        Camp updatedCamp = new Camp(campId, campName, dates, country, cost, courts);
        campService.updateCamp(updatedCamp);
    }
}
