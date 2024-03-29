package entity;

public class User extends Person {

    private String userName;

    private String password;

    @Override
    public void login() {
        System.out.println("Logging in");
    }

    // getter & setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // methods

    public void viewCars() {
    }

    public void purchaseCars() {
    }

    public void filterCars() {
    }

    public void viewTicket() {
    }

    public void applyForMembership() {
    }

    public boolean isMember() {
        return true;
    }

}
