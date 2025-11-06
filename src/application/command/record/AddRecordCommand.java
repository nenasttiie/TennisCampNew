package application.command.record;

import application.command.Command;
import application.services.RecordService;
import domain.model.Coach;
import domain.model.Record;
import infrastructure.repository.InMemoryPlayerRepository;
import infrastructure.repository.InMemoryRecordRepository;

import java.util.Scanner;

public class AddRecordCommand implements Command {
    private final RecordService recordService;

    public AddRecordCommand(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public void execute() {
        System.out.println("Введите данные записи:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID записи:");
        int recordId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите ID игрока:");
        int playerId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите ID кемпа:");
        int campId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите дату записи:");
        String date = scanner.nextLine();

        Record record = new Record(recordId, playerId, campId, date);

        recordService.addRecord(record);
    }
}
