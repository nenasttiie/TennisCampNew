package domain.model;

public class Record {
    private int record_id, player_id, camp_id;
    private String booking_date;

    public Record(int record_id, int player_id, int camp_id, String booking_date) {
        this.record_id = record_id;
        this.player_id = player_id;
        this.camp_id = camp_id;
        this.booking_date = booking_date;
    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getCamp_id() {
        return camp_id;
    }

    public void setCamp_id(int camp_id) {
        this.camp_id = camp_id;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }
}
