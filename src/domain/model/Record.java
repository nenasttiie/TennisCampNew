package domain.model;

public class Record {
    private int recordId;
    private int playerId;
    private int campId;
    private String bookingDate;

    public Record(int recordId, int playerId, int campId, String bookingDate) {
        this.recordId = recordId;
        this.playerId = playerId;
        this.campId = campId;
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", playerId=" + playerId +
                ", campId=" + campId +
                ", bookingDate='" + bookingDate + '\'' +
                '}';
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
}
