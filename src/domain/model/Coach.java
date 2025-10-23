package domain.model;

public class Coach {
    private int coach_id, camp_id;
    private String surname, name, category;

    public Coach(int coach_id, int camp_id, String surname, String name, String category) {
        this.coach_id = coach_id;
        this.camp_id = camp_id;
        this.surname = surname;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "coachId=" + coach_id +
                ", campId=" + camp_id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(int coach_id) {
        this.coach_id = coach_id;
    }

    public int getCamp_id() {
        return camp_id;
    }

    public void setCamp_id(int camp_id) {
        this.camp_id = camp_id;
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
