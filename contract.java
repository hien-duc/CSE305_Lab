import java.util.ArrayList;

public class contract {
  private int contractID;
  private int propertyID;
  private int tenantID;
  private String startDate;
  private String endDate;
  private double rentAmount;

  public contract(int contractID, int propertyID, int tenantID, String startDate, String endDate, double rentAmount) {
    this.contractID = contractID;
    this.propertyID = propertyID;
    this.tenantID = tenantID;
    this.startDate = startDate;
    this.endDate = endDate;
    this.rentAmount = rentAmount;
  }

  public int getContractID() {
    return contractID;
  }

  public void setContractID(int contractID) {
    this.contractID = contractID;
  }

  public int getPropertyID() {
    return propertyID;
  }

  public void setPropertyID(int propertyID) {
    this.propertyID = propertyID;
  }

  public int getTenantID() {
    return tenantID;
  }

  public void setTenantID(int tenantID) {
    this.tenantID = tenantID;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public double getRentAmount() {
    return rentAmount;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }

  public static contract CreateContract(int contractID, int propertyID, int tenantID, String startDate,
      String endDate, double rentAmount) {
    return new contract(contractID, propertyID, tenantID, startDate, endDate, rentAmount);
  }

  public static void TerminateContract(contract contract, ArrayList<contract> contracts) {
    contracts.remove(contract);
  }
}
