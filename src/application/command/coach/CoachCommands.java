package application.command.coach;

import application.command.Command;

public class CoachCommands {
    private final Command addCoachCommand;
    private final Command findCoachCommand;
    private final Command updateCoachCommand;
    private final Command deleteCoachCommand;

    public CoachCommands(Command addCoachCommand, Command findCoachCommand, Command updateCoachCommand, Command deleteCoachCommand) {
        this.addCoachCommand = addCoachCommand;
        this.findCoachCommand = findCoachCommand;
        this.updateCoachCommand = updateCoachCommand;
        this.deleteCoachCommand = deleteCoachCommand;
    }

    public void addCoach() {
        addCoachCommand.execute();
    }

    public void findCoach() {
        findCoachCommand.execute();
    }

    public void updateCoach() {
        updateCoachCommand.execute();
    }

    public void deleteCoach() {
        deleteCoachCommand.execute();
    }
}
