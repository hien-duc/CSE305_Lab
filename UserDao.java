import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * UserDao
 */
public class UserDao {

    String folderPath = "Register.txt";
    private String fileDataByChar = "Register.txt";
    StringBuilder sbd = new StringBuilder();

    // constructors
    public UserDao() {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File data = new File(folderPath + "\\" + fileDataByChar);
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // methods
    public boolean checkUpdate_User(ArrayList<User> list) {
        File file = new File(folderPath + "\\" + fileDataByChar);
        boolean flag = false;

        try {
            FileReader fileReader = new FileReader(folderPath + "\\" + fileDataByChar);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder fileContents = new StringBuilder();
            String line;
            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                fileContents.append(line);
            }
            sbdContents(list);
            // Check if the current file state is different from the previous state
            if (!fileContents.toString().equals(sbd.toString())) {
                flag = true;
            } else {
                flag = false;
            }

            // Update the previous file state
            sbd = fileContents;

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void sbdContents(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User temp = list.get(i);
            String userID = temp.getUserId();
            String firstName = temp.getFirstName();
            String lastName = temp.getLastName();
            String email = temp.getEmail();
            String line = userID + "," + firstName + "," + lastName;
            sbd.append(line);
        }
    }

    public void saveDataByChar(ArrayList<User> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        sbd = new StringBuilder();
        try {
            fw = new FileWriter(folderPath + "\\" + fileDataByChar);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                User temp = list.get(i);
                String userID = temp.getUserId();
                String firstName = temp.getFirstName();
                String lastName = temp.getLastName();
                String passsword = temp.getPassword();
                String email = temp.getEmail();
                String line = userID + "," + firstName + "," + lastName +"," +email;

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

    public ArrayList<User> restoreDataFromChar() {
        FileReader fr = null;
        BufferedReader br = null;
        String[] temp = new String[5];
        ArrayList<User> list1 = new ArrayList<>();
        try {
            fr = new FileReader(folderPath + "\\" + fileDataByChar);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {

                temp = line.split(",");
            }
            return list1;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
