import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class ConstractDAO implements Serializable {

  private String pathFolder = System.getProperty("user.dir");
  private String pathFile = System.getProperty(pathFolder + "/Contract.ser");
  private ArrayList<Contract> contractList = new ArrayList<Contract>();

  public ConstractDAO() {
    File file = new File(pathFile);
    File folderFile = new File(pathFolder);

    if (!folderFile.exists()) {
      folderFile.mkdirs();
    }
    if (!file.exists()) {
      file.mkdirs();
    }
  }

  public ArrayList<Contract> restoreContractList(){
    
  }

  public ArrayList<Contract> getAllContract() {
    return contractList;
  }

}
