package domain.model;

public class Camp {
    private int campId;
    private String campName;
    private String dates;
    private String country;
    private String cost;
    private String courts;

    @Override
    public String toString() {
        return "Camp{" +
                "campId=" + campId +
                ", campName='" + campName + '\'' +
                ", dates='" + dates + '\'' +
                ", country='" + country + '\'' +
                ", cost='" + cost + '\'' +
                ", courts='" + courts + '\'' +
                '}';
    }

    public Camp(int campId, String campName, String dates, String country, String cost, String courts) {
        this.campId = campId;
        this.campName = campName;
        this.dates = dates;
        this.country = country;
        this.cost = cost;
        this.courts = courts;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
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
