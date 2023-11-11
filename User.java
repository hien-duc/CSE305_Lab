/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class User {

    // data members
    String userId;
    String firstName;
    String lastName;
    String email;
    String password;

    // Constructor
    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public User(String id,
            String firsName,
            String lastName,
            String email,
            String password) {
        this.userId = id;
        this.firstName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }

    // Methods
    public static ArrayList<User> restoreDataRegister(ArrayList<User> list, User user) {

        return list;
    }

    public static void setList(ArrayList<User> list) {
        list = restoreDataRegister(list, null);

    }

    public static ArrayList<User> Register() {
        User user = new User();
        ArrayList list = restoreDataRegister(null, user);
        list.add(user);
        return list;
    }

    public static boolean Login(String id, String password) {
        ArrayList<User> list = Register();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (id.equals(user.getUserId()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;

    }

    public void UpdateProfile() {
    }

    public String resetpassword(String Username, String password) {
        this.password = password;
        return this.password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    // Methods
}
