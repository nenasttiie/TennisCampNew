package application.command.coach;

import application.command.Command;
import application.services.CoachService;
import domain.model.Coach;
import infrastructure.repository.InMemoryCoachRepository;

import java.util.Scanner;

public class UpdateCoachCommand implements Command {
    private final CoachService coachService;

    public UpdateCoachCommand(CoachService coachService) {
        this.coachService = coachService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID тренера, данные которого надо изменить: ");
        Scanner scanner = new Scanner(System.in);

        int coachId = scanner.nextInt();
        scanner.nextLine();
        Coach coach = coachService.findCoachById(coachId);
        String flag;

        int campId = coach.getCamp_id();
        System.out.println("Менять Camp ID?");
        flag = scanner.nextLine();

        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый Camp ID: ");
            campId = scanner.nextInt();
            scanner.nextLine();
        }

        String surname = coach.getSurname();
        System.out.println("Менять фамилию?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новая фамилия: ");
            surname = scanner.nextLine();
        }

        String name = coach.getName();
        System.out.println("Менять имя?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новое имя: ");
            name = scanner.nextLine();
        }

        String category = coach.getCategory();
        System.out.println("Менять разряд?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый разряд: ");
            category = scanner.nextLine();
        }

        Coach updatedCoach = new Coach(coachId, campId, surname, name, category);
        coachService.updateCoach(updatedCoach);
    }
}
