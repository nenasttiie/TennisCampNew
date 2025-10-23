import application.command.*;
import infrastructure.repository.InMemoryCoachRepository;

public class TestCommand {
    public static void main(String[] args) {
        InMemoryCoachRepository coaches = new InMemoryCoachRepository();

        Command addCoach = new AddCoachCommand(coaches);
        Command findCoach = new FindCoachByIdCommand(coaches);
        Command updateCoach = new UpdateCoachCommand(coaches);
        Command deleteCoach = new DeleteCoachCommand(coaches);

        CoachCommands commands = new CoachCommands(addCoach, findCoach, updateCoach, deleteCoach);

        ConsoleMenu menu = new ConsoleMenu(commands);
        menu.start();
//        commands.addCoach();
//        commands.findCoach();
//        commands.updateCoach();
//        commands.findCoach();
//        commands.deleteCoach();
//        commands.findCoach();
    }
}
