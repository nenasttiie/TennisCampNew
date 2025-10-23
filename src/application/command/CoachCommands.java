package application.command;

public class CoachCommands {
    private Command addCoachCommand;
    private Command findCoachCommand;
    private Command updateCoachCommand;
    private Command deleteCoachCommand;

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
