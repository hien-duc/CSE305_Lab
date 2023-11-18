import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class PropertyTenant extends User {
  private String propertyAddress;
  private double monthlyRent;
  private ArrayList<Contract> contract;

  ClassLoader classLoader = getClass().getClassLoader();
  String path = classLoader.getResource("propertyTenant.txt").toString();

  public PropertyTenant(String userId, String firstName, String lastName, String email, String password,
      String propertyAddress, double monthlyRent) {
    super(userId, firstName, lastName, email, password);
    this.propertyAddress = propertyAddress;
    this.monthlyRent = monthlyRent;
  }

  public void saveTenantDataByChar(ArrayList<PropertyTenant> list) {
    FileWriter fw = null;
    BufferedWriter bw = null;
    try {
      fw = new FileWriter(path + "propertyData.txt" + "\\");
      bw = new BufferedWriter(fw);

      for (int i = 0; i < list.size(); i++) {
        PropertyTenant temp = list.get(i);
        String userId = temp.getUserId();
        String firstName = temp.getFirstName();
        String lastName = temp.getLastName();
        String email = temp.getEmail();
        String password = temp.getPassword();
        String propertyAddress = temp.getPropertyAddress();
        double monthlyRent = temp.getMonthlyRent();

        String line = userId + "," + firstName + "," + lastName + "," + email + "," + password + "," + propertyAddress
            + "," + monthlyRent;

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

  public ArrayList<PropertyTenant> restoreTenantDataFromChar() {
    FileReader fr = null;
    BufferedReader br = null;
    String[] temp = new String[4];
    ArrayList<PropertyTenant> list1 = new ArrayList<>();
    try {
      fr = new FileReader(path + "propertyTenant.txt" + "\\");
      br = new BufferedReader(fr);
      String line = "";
      while ((line = br.readLine()) != null) {

        temp = line.split(",");

        PropertyTenant property = new PropertyTenant((temp[0]), (temp[1]), (temp[2]), (temp[3]), (temp[4]), (temp[5]),
            Double.parseDouble((temp[6])));

        list1.add(property);
      }
      br.close();

      return list1;
    } catch (Exception ex) {
      System.out.println(ex);
    }
    return null;
  }

  public PropertyTenant searchByID(String propertyID) {
    ArrayList<PropertyTenant> list = restoreTenantDataFromChar();
    for (int i = 0; i < list.size(); i++) {
      PropertyTenant temp = list.get(i);
      if (temp.getUserId().equals(propertyID)) {
        return temp;
      }
    }
    return null;

  }

  public boolean createPropertyTenant(PropertyTenant propertyTenant) {
    PropertyTenant propertyTemp = searchByID(propertyTenant.getUserId());
    if (propertyTemp == null) {
      return true;
    } else {
      return false;
    }
  }

  public boolean updatePropertyTenant(PropertyTenant updatePropertyTenant) {
    PropertyTenant propertyTemp = searchByID(updatePropertyTenant.getUserId());

    if (propertyTemp != null) {
      restoreTenantDataFromChar().set(restoreTenantDataFromChar().indexOf(propertyTemp), updatePropertyTenant);
      return true;
    } else {
      return false;
    }
  }


////Get and set properties


  public String getPropertyAddress() {
    return propertyAddress;
  }

  public void setPropertyAddress(String propertyAddress) {
    this.propertyAddress = propertyAddress;
  }

  public double getMonthlyRent() {
    return monthlyRent;
  }

  public void setMonthlyRent(double monthlyRent) {
    this.monthlyRent = monthlyRent;
  }

  public ArrayList<Contract> getLeases() {
    return contract;
  }

}
