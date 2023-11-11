import java.util.ArrayList;

public class Contract {

  private int contractID;
  private int propertyID;
  private int tenantID;
  private Long startDate;
  private Long endDate;
  private double rentAmount;

  public Contract(
    int contractID,
    int propertyID,
    int tenantID,
    Long startDate,
    Long endDate,
    double rentAmount
  ) {
    this.contractID = contractID;
    this.propertyID = propertyID;
    this.tenantID = tenantID;
    this.startDate = startDate;
    this.endDate = endDate;
    this.rentAmount = rentAmount;
  }

  public static ArrayList<Contract> CreateContract(
    Contract contract,
    ArrayList<Contract> listOfContract
  ) {
    listOfContract.add(contract);
    return listOfContract;
  }

  public static ArrayList<Contract> TerminateContract(
    Contract contract,
    ArrayList<Contract> contracts
  ) {
    contracts.remove(contract);
    return contracts;
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

  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public double getRentAmount() {
    return rentAmount;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }
}
