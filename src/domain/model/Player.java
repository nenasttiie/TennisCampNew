package domain.model;

public class Player {
    private int playerId;
    private String lastName;
    private String name;
    private String phoneNumber;
    private String email;
    private double ntrp;

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", ntrp=" + ntrp +
                '}';
    }

    public Player(int playerId, String lastName, String name, String phone_number, String email, double ntrp) {
        this.playerId = playerId;
        this.lastName = lastName;
        this.name = name;
        this.phoneNumber = phone_number;
        this.email = email;
        this.ntrp = ntrp;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
