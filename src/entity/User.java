package entity;

public class User extends Person {

    private String userName;

    private String password;

    @Override
    public void login() {
        System.out.println("Logging in");
    }

    // getter & setters

    public boolean isMember() {
        return true;
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

}
