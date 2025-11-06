package domain.model;

public class Coach {
    private int coachId;
    private int campId;
    private String surname;
    private String name;
    private String category;

    public Coach(int coachId, int campId, String surname, String name, String category) {
        this.coachId = coachId;
        this.campId = campId;
        this.surname = surname;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "coachId=" + coachId +
                ", campId=" + campId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
