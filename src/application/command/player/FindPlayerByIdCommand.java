package application.command.player;

import application.command.Command;
import application.services.PlayerService;
import infrastructure.repository.InMemoryPlayerRepository;

import java.util.Scanner;

public class FindPlayerByIdCommand implements Command {
    private final PlayerService playerService;

    public FindPlayerByIdCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID игрока, которого хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int playerId = scanner.nextInt();
        System.out.println(playerService.findPlayerById(playerId));
    }
}
