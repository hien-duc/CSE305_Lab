import java.util.ArrayList;


public class PropertyOwner extends user {

  public PropertyOwner(int userId, String firstName, String lastName, String email, String password) {
    super(userId, firstName, lastName, email, password);

  }

  private String address;
  private double totalPropertyValue;
  private ArrayList<Property> ownedProperties;

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

  public ArrayList<Property> ListProperties() {
    return ownedProperties;
  }

  public void CreateProperty(Property property) {
    ownedProperties.add(property);
  }

  public void UpdateProperty(Property property) {
    ownedProperties.add(property);
  }

  public void DeleteProperty(Property property) {
    ownedProperties.remove(property);
  }

}
