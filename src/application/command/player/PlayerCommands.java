package application.command.player;

import application.command.Command;

public class PlayerCommands {
    private final Command addPlayerCommand;
    private final Command findPlayerCommand;
    private final Command updatePlayerCommand;
    private final Command deletePlayerCommand;

    public PlayerCommands(Command addPlayerCommand, Command findPlayerCommand, Command updatePlayerCommand, Command deletePlayerCommand) {
        this.addPlayerCommand = addPlayerCommand;
        this.findPlayerCommand = findPlayerCommand;
        this.updatePlayerCommand = updatePlayerCommand;
        this.deletePlayerCommand = deletePlayerCommand;
    }

    public void addPlayer() {
        addPlayerCommand.execute();
    }

    public void findPlayer() {
        findPlayerCommand.execute();
    }

    public void updatePlayer() {
        updatePlayerCommand.execute();
    }

    public void deletePlayer() {
        deletePlayerCommand.execute();
    }
}
