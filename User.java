/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class User {

    // data members
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;

    ClassLoader classLoader = getClass().getClassLoader();
    String path = classLoader.getResource("Register.txt").toString();

    // Constructor
    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public User(String id,
            String firstName,
            String lastName,
            String email,
            String password) {
        this.userId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }

    // Methods
    public void createfileUserDAO() {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File data = new File("Register.txt" + "\\" + path);
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public void saveDataByChar(ArrayList<User> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("Register.txt" + "\\" + path);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                User temp = list.get(i);
                String userId = temp.getUserId();
                String firstName = temp.getFirstName();
                String lastName = temp.getLastName();
                String email = temp.getEmail();
                String password = temp.getPassword();

                String line = userId + "," + firstName + "," + lastName + "," + email + "," + password;

                bw.write(line);
                bw.newLine();

            }
            bw.flush();

        } catch (Exception ex) {

        } finally {
            try {
                fw.close();
                bw.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static ArrayList<User> restoreDataRegister() {
        FileReader fr = null;
        BufferedReader br = null;
        String[] temp = new String[6];
        ArrayList<User> list1 = new ArrayList<>();
        try {
            fr = new FileReader("Register.txt" + "\\" + path);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {

                temp = line.split(",");

                User user = new User(temp[0], (temp[1]), (temp[2]), (temp[3]), (temp[4]));

                list1.add(user);
            }
            br.close();

            return list1;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public void setListUser(ArrayList<User> list) {

        ArrayList<User> listtemp = restoreDataRegister();
        listtemp = list;
    }

    public ArrayList<User> getListUser() {
        return restoreDataRegister();
    }

    public static boolean Login(String id, String password) {
        ArrayList<User> list = restoreDataRegister();
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