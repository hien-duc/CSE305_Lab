import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ConstractDAO {
  private String rootPath = System.getProperty("user.dir");
  private String folderPath = rootPath + "\\CSE305_Lab";
  private String filePath = folderPath + "\\" + "Contract.txt";
  private ArrayList<Contract> contractList = new ArrayList<Contract>();

  public ConstractDAO() {
    File folder = new File(folderPath);
    File file = new File(filePath);

    if (!folder.exists()) {
      folder.mkdirs();
    }
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException ex) {
      }
    }
  }

  public ArrayList<Contract> restoreContractList() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;
    ArrayList<Contract> accountData = null;

    try {

      fis = new FileInputStream(folderPath + "\\" + "Contract.txt");
      ois = new ObjectInputStream(fis);
      accountData = (ArrayList<Contract>) ois.readObject();

    } catch (FileNotFoundException ex) {
    } catch (IOException | ClassNotFoundException ex) {
    } finally {

      try {
        fis.close();
        ois.close();
      } catch (IOException ex) {
      }
    }

    return accountData;

  }

  public void SaveAccountAsByte(ArrayList<Contract> list) {
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
      fos = new FileOutputStream(folderPath + "\\" + "Contract.txt");
      oos = new ObjectOutputStream(fos);

      oos.writeObject(list);
      oos.flush();

    } catch (IOException ex) {
    } finally {

      try {
        fos.close();
        oos.close();
      } catch (IOException ex) {
      }
    }
  }

  public ArrayList<Contract> getAllContract() {
    return contractList;
  }

}
