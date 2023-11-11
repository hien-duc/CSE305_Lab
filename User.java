package main;

public class User {

    //Data members
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;

    //constructors
    public User() {

    }

    public User(String userID, String firstName, String lastName, String email, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }

    //Methods
    public void register() {

    }

    public void Login() {

    }

    public void updateProfile() {

    }

    public void resetPassword() {

    }

//get set method
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
