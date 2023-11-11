import java.util.ArrayList;


public class propertyOwner extends user {

  public propertyOwner(int userId, String firstName, String lastName, String email, String password) {
    super(userId, firstName, lastName, email, password);

  }

  private String address;
  private double totalPropertyValue;
  private ArrayList<property> ownedProperties;

  public double getTotalPropertyValue() {
    return totalPropertyValue;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setTotalPropertyValue(double totalPropertyValue) {
    this.totalPropertyValue = totalPropertyValue;
  }

  public ArrayList<property> ListProperties() {
    return ownedProperties;
  }

  public void CreateProperty(property property) {
    ownedProperties.add(property);
  }

  public void UpdateProperty(property property) {
    ownedProperties.add(property);
  }

  public void DeleteProperty(property property) {
    ownedProperties.remove(property);
  }

}
