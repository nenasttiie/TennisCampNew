package main;

import application.command.*;
import application.command.camp.*;
import application.command.coach.*;
import application.command.menu.ConsoleMenu;
import application.command.player.*;
import application.command.record.*;
import application.services.CampService;
import application.services.CoachService;
import application.services.PlayerService;
import application.services.RecordService;
import infrastructure.repository.InMemoryCampRepository;
import infrastructure.repository.InMemoryCoachRepository;
import infrastructure.repository.InMemoryPlayerRepository;
import infrastructure.repository.InMemoryRecordRepository;

public class TestCommand {
    public static void main(String[] args) {
        InMemoryCoachRepository coaches = new InMemoryCoachRepository();
        InMemoryCampRepository camps = new InMemoryCampRepository();
        InMemoryPlayerRepository players = new InMemoryPlayerRepository();
        InMemoryRecordRepository records = new InMemoryRecordRepository();

        CampService campService = new CampService(camps);
        CoachService coachService = new CoachService(coaches);
        PlayerService playerService = new PlayerService(players);
        RecordService recordService = new RecordService(records);

        Command addCoach = new AddCoachCommand(coachService);
        Command findCoach = new FindCoachByIdCommand(coachService);
        Command updateCoach = new UpdateCoachCommand(coachService);
        Command deleteCoach = new DeleteCoachCommand(coachService);

        Command addCamp = new AddCampCommand(campService);
        Command findCamp = new FindCampByIdCommand(campService);
        Command updateCamp = new UpdateCampCommand(campService);
        Command deleteCamp = new DeleteCampCommand(campService);

        Command addPlayer = new AddPlayerCommand(playerService);
        Command findPlayer = new FindPlayerByIdCommand(playerService);
        Command updatePlayer = new UpdatePlayerCommand(playerService);
        Command deletePlayer = new DeletePlayerCommand(playerService);

        Command addRecord = new AddRecordCommand(recordService);
        Command findRecord = new FindRecordByIdCommand(recordService);
        Command updateRecord = new UpdateRecordCommand(recordService);
        Command deleteRecord = new DeleteRecordCommand(recordService);

        CoachCommands coachCommands = new CoachCommands(addCoach, findCoach, updateCoach, deleteCoach);
        CampCommands campCommands = new CampCommands(addCamp, findCamp, updateCamp, deleteCamp);
        PlayerCommands playerCommands = new PlayerCommands(addPlayer, findPlayer, updatePlayer, deletePlayer);
        RecordCommands recordCommands = new RecordCommands(addRecord, findRecord, updateRecord, deleteRecord);

        ConsoleMenu menu = new ConsoleMenu(campCommands, coachCommands, playerCommands, recordCommands);
        menu.start();
    }
}
