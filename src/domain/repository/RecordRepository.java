package domain.repository;

import domain.model.Record;

public interface RecordRepository {
    void addRecord(Record record);

    Record findRecordById(int recordId);

    void updateRecord(Record updatedRecord);

    void deleteRecord(int recordId);
}
