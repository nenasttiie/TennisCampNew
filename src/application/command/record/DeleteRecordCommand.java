package application.command.record;

import application.command.Command;
import application.services.RecordService;
import infrastructure.repository.InMemoryRecordRepository;

import java.util.Scanner;

public class DeleteRecordCommand implements Command {
    private final RecordService recordService;

    public DeleteRecordCommand(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID записи, которую хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int recordId = scanner.nextInt();
        recordService.deleteRecord(recordId);
    }
}
