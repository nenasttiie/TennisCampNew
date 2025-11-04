package infrastructure.repository;

import domain.model.Coach;
import domain.model.Record;
import domain.repository.RecordRepository;

import java.util.HashMap;

public class InMemoryRecordRepository implements RecordRepository {
    HashMap<Integer, Record> records = new HashMap<>();
    @Override
    public void addRecord(Record record) {
        records.put(record.getRecord_id(), record);
    }

    @Override
    public Record findRecordById(int recordId) {
        return records.get(recordId);
    }

    @Override
    public void updateRecord(Record updatedRecord) {
        records.put(updatedRecord.getRecord_id(), updatedRecord);
    }

    @Override
    public void deleteRecord(int recordId) {
        records.remove(recordId);
    }
}
