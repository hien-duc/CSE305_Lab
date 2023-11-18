
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class User {

    // data members
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected ArrayList<User> listUsers = restoreDataRegister();

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

    //tao file chua du lieu login
    public void createfileUserDAO() {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File data = new File(path + "\\" + "Register.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException ex) {
            }
        }
    }
//viet du lieu xuong
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
// lay du lieu len
    public ArrayList<User> restoreDataRegister() {
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

        this.listUsers = list;

    }

    public ArrayList<User> getListUser() {
        return restoreDataRegister();
    }

    //Dang nhap
    public boolean Login(String id, String password) {
        ArrayList<User> list = restoreDataRegister();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (id.equals(user.getUserId()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;

    }
//Cap nhat user
    public boolean UpdateProfile(User user) {
        boolean result = false;
        for (int i = 0; i < listUsers.size(); i++) {
            User temp = listUsers.get(i);
            if (temp.getUserId() == user.getUserId()) {

                restoreDataRegister().set(restoreDataRegister().indexOf(temp), createUSersBaseOnConcreteBuilder(user));
                System.out.println("Success");
                result = true;
            } else {
                System.out.println("Unsuccess");
                result = false;
            }
           
        }

        saveDataByChar(listUsers);
        return result;
    }

    //Tao user
    public User createUSersBaseOnConcreteBuilder(User user) {
        User user1 = new ConcreteUsers().setid(user.getUserId()).setFirstName(user.getFirstName())
                .setLastname(user.getLastName()).setEmail(user.getEmail()).setPassword(user.getPassword()).build();
        return user1;

    }
//Them USer
    public boolean addUsers(User user) {
        boolean result = true;
        for (int i = 0; i < listUsers.size(); i++) {
            if (listUsers.get(i).getUserId() == user.getUserId()) {
                System.out.println("User is existed");
                result = false;
            } else {
                User usertemp = createUSersBaseOnConcreteBuilder(user);
                listUsers.add(usertemp);
                System.out.println("Added Successfully");
                result = true;
            }

        }
        return result;
    }

    //Doi mat khau
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

}