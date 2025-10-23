package domain.model;

public class Camp {
    private int camp_id;
    private String camp_name, dates, country, cost, courts;

    public Camp(int camp_id, String camp_name, String dates, String country, String cost, String courts) {
        this.camp_id = camp_id;
        this.camp_name = camp_name;
        this.dates = dates;
        this.country = country;
        this.cost = cost;
        this.courts = courts;
    }

    public int getCamp_id() {
        return camp_id;
    }

    public void setCamp_id(int camp_id) {
        this.camp_id = camp_id;
    }

    public String getCamp_name() {
        return camp_name;
    }

    public void setCamp_name(String camp_name) {
        this.camp_name = camp_name;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCourts() {
        return courts;
    }

    public void setCourts(String courts) {
        this.courts = courts;
    }
}
