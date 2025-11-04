package application.command.camp;

import application.command.Command;

public class CampCommands {
    private final Command addCampCommand;
    private final Command findCampCommand;
    private final Command updateCampCommand;
    private final Command deleteCampCommand;

    public CampCommands(Command addCampCommand, Command findCampCommand, Command updateCampCommand, Command deleteCampCommand) {
        this.addCampCommand = addCampCommand;
        this.findCampCommand = findCampCommand;
        this.updateCampCommand = updateCampCommand;
        this.deleteCampCommand = deleteCampCommand;
    }

    public void addCamp() {
        addCampCommand.execute();
    }

    public void findCamp() {
        findCampCommand.execute();
    }

    public void updateCamp() {
        updateCampCommand.execute();
    }

    public void deleteCamp() {
        deleteCampCommand.execute();
    }
}
