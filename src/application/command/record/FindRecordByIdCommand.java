package application.command.record;

import application.command.Command;
import application.services.RecordService;
import infrastructure.repository.InMemoryRecordRepository;

import java.util.Scanner;

public class FindRecordByIdCommand implements Command {
    private final RecordService recordService;

    public FindRecordByIdCommand(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID записи, которую хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int recordId = scanner.nextInt();
        System.out.println(recordService.findRecordById(recordId));
    }
}
