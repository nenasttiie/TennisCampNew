package application.command.player;

import application.command.Command;
import application.services.PlayerService;
import domain.model.Coach;
import domain.model.Player;
import infrastructure.repository.InMemoryCampRepository;
import infrastructure.repository.InMemoryPlayerRepository;

import java.util.Scanner;

public class AddPlayerCommand implements Command {
    private final PlayerService playerService;

    public AddPlayerCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void execute() {
        System.out.println("Введите данные игрока:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID игрока:");
        int playerId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите фамилию игрока:");
        String surname = scanner.nextLine();

        System.out.println("Введите имя игрока:");
        String name = scanner.nextLine();

        System.out.println("Введите номер телефона игрока:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Введите email игрока:");
        String email = scanner.nextLine();

        System.out.println("Уровень игрока (NTRP):");
        double ntrp = scanner.nextDouble();
        scanner.nextLine();

        Player player = new Player(playerId, surname, name, phoneNumber, email, ntrp);

        playerService.addPlayer(player);
    }
}
