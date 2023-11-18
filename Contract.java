import java.io.Serializable;
import java.util.ArrayList;

public class Contract implements Serializable {

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
      double rentAmount) {
    this.contractID = contractID;
    this.propertyID = propertyID;
    this.tenantID = tenantID;
    this.startDate = startDate;
    this.endDate = endDate;
    this.rentAmount = rentAmount;
  }

  public Contract(RentalContractBuilder builder) {
    this.contractID = builder.contractID;
    this.propertyID = builder.propertyID;
    this.tenantID = builder.tenantID;
    this.startDate = builder.startDate;
    this.endDate = builder.endDate;
    this.rentAmount = builder.rentAmount;
  }

  public static ArrayList<Contract> createContract(
      Contract contract,
      ArrayList<Contract> listOfContract) {
    listOfContract.add(contract);
    return listOfContract;
  }

  public static ArrayList<Contract> terminateContract(
      Contract contract,
      ArrayList<Contract> contracts) {
    contracts.remove(contract);
    return contracts;
  }

  public static class RentalContractBuilder {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private Long startDate;
    private Long endDate;
    private double rentAmount;

    public RentalContractBuilder(int contractID, int propertyID, int tenantID) {
      this.contractID = contractID;
      this.propertyID = propertyID;
      this.tenantID = tenantID;
    }

    public RentalContractBuilder startDate(Long startDate) {
      this.startDate = startDate;
      return this;
    }

    public RentalContractBuilder endDate(Long endDate) {
      this.endDate = endDate;
      return this;
    }

    public RentalContractBuilder rentAmount(double rentAmount) {
      this.rentAmount = rentAmount;
      return this;
    }

    public Contract build() {
      return new Contract(this);
    }
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
