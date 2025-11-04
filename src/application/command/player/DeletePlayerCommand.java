package application.command.player;

import application.command.Command;
import application.services.PlayerService;
import infrastructure.repository.InMemoryPlayerRepository;

import java.util.Scanner;

public class DeletePlayerCommand implements Command {
    private final PlayerService playerService;

    public DeletePlayerCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID игрока, которого хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int playerId = scanner.nextInt();
        playerService.deletePlayer(playerId);
    }
}
