package domain.model;

public class Player {
    private int player_id;
    private String last_name, name, phone_number, email;
    private double ntrp;

    @Override
    public String toString() {
        return "Player{" +
                "player_id=" + player_id +
                ", last_name='" + last_name + '\'' +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", ntrp=" + ntrp +
                '}';
    }

    public Player(int player_id, String last_name, String name, String phone_number, String email, double ntrp) {
        this.player_id = player_id;
        this.last_name = last_name;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.ntrp = ntrp;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNtrp() {
        return ntrp;
    }

    public void setNtrp(double ntrp) {
        this.ntrp = ntrp;
    }
}
