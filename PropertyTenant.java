import java.util.ArrayList;

public class PropertyTenant extends User {
  private String propertyAddress;
  private double monthlyRent;
  private ArrayList<Contract> contract;

  public PropertyTenant(int userId, String firstName, String lastName, String email, String password,
      String propertyAddress, double monthlyRent) {
    super(userId, firstName, lastName, email, password);
    this.propertyAddress = propertyAddress;
    this.monthlyRent = monthlyRent;
  }

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

  public void CreateProperty(Contract con) {
    contract.add(con);
  }

  public void TerminateRentalContact(Contract con) {
    contract.remove(con);
  }

  public ArrayList<Contract> getLeases() {
    return contract;
  }

}
