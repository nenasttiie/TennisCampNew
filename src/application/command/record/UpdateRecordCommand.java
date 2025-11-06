package application.command.record;

import application.command.Command;
import application.services.RecordService;
import domain.model.Record;

import java.util.Scanner;

public class UpdateRecordCommand implements Command {
    private final RecordService recordService;

    public UpdateRecordCommand(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public void execute() {
        System.out.println("Введите ID записи, данные которой надо изменить: ");
        Scanner scanner = new Scanner(System.in);

        int recordId = scanner.nextInt();
        scanner.nextLine();
        Record record = recordService.findRecordById(recordId);
        String flag;

        int playerId = record.getPlayerId();
        System.out.println("Менять ID игрока?");
        flag = scanner.nextLine();

        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый ID игрока: ");
            playerId = scanner.nextInt();
            scanner.nextLine();
        }

        int campId = record.getCampId();
        System.out.println("Менять Camp ID?");
        flag = scanner.nextLine();

        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новый Camp ID: ");
            campId = scanner.nextInt();
            scanner.nextLine();
        }

        String date = record.getBookingDate();
        System.out.println("Менять дату?");
        flag = scanner.nextLine();
        if (flag.equals("Да") | flag.equals("да")) {
            System.out.println("Новая дата: ");
            date = scanner.nextLine();
        }

        Record updatedRecord = new Record(recordId, playerId, campId, date);
        recordService.updateRecord(updatedRecord);
    }
}
