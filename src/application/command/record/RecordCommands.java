package application.command.record;

import application.command.Command;

public class RecordCommands {
    private final Command addRecordCommand;
    private final Command findRecordCommand;
    private final Command updateRecordCommand;
    private final Command deleteRecordCommand;

    public RecordCommands(Command addRecordCommand, Command findRecordCommand, Command updateRecordCommand, Command deleteRecordCommand) {
        this.addRecordCommand = addRecordCommand;
        this.findRecordCommand = findRecordCommand;
        this.updateRecordCommand = updateRecordCommand;
        this.deleteRecordCommand = deleteRecordCommand;
    }

    public void addRecord() {
        addRecordCommand.execute();
    }

    public void findRecord() {
        findRecordCommand.execute();
    }

    public void updateRecord() {
        updateRecordCommand.execute();
    }

    public void deleteRecord() {
        deleteRecordCommand.execute();
    }
}
