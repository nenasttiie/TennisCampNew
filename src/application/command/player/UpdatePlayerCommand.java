package application.command.player;

import application.command.Command;
import application.services.PlayerService;
import domain.model.Player;

import java.util.Scanner;

public class UpdatePlayerCommand implements Command {
    private final PlayerService playerService;

    public UpdatePlayerCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID игрока, данные которого надо изменить: ");
        Scanner scanner = new Scanner(System.in);

        int playerId = scanner.nextInt();
        scanner.nextLine();
        Player player = playerService.findPlayerById(playerId);
        String flag;

        String lastName = player.getLastName();
        System.out.println("Менять фамилию?");
        flag = scanner.nextLine();

        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новая фамилия: ");
            lastName = scanner.nextLine();
        }

        String name = player.getName();
        System.out.println("Менять имя?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новое имя: ");
            name = scanner.nextLine();
        }

        String phoneNumber = player.getPhoneNumber();
        System.out.println("Менять номер телефона?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый номер телефона: ");
            phoneNumber = scanner.nextLine();
        }

        String email = player.getEmail();
        System.out.println("Менять email?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый email: ");
            email = scanner.nextLine();
        }

        double ntrp = player.getNtrp();
        System.out.println("Менять NTRP?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый NTRP: ");
            ntrp = scanner.nextDouble();
        }

        Player updatedPlayer = new Player(playerId, lastName, name, phoneNumber, email, ntrp);
        playerService.updatePlayer(updatedPlayer);
    }
}
