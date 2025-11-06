package application.services;

import domain.model.Record;
import infrastructure.repository.InMemoryRecordRepository;

public class RecordService {
    private final InMemoryRecordRepository recordRepository;

    public RecordService(InMemoryRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }
    public void addRecord(Record record){
        recordRepository.addRecord(record);
    }
    public Record findRecordById(int recordId){
        return recordRepository.findRecordById(recordId);
    }
    public void updateRecord(Record updatedRecord){
        recordRepository.updateRecord(updatedRecord);
    }
    public void deleteRecord(int recordId){
        recordRepository.deleteRecord(recordId);
    }
}
