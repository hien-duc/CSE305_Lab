package main;

public class Contract {

    //Data members
    protected String contractID;
    protected String propertyID;
    protected String tenantID;
    protected String startDate;
    protected String endDate;
    protected String rentAmoun;

    //constructors
    public Contract() {

    }

    public Contract(String contractID, String propertyID, String tenantID, String startDate, String endDate, String rentAmoun) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentAmoun = rentAmoun;
    }

    //Methods
    public void CreateContract() {

    }

    public void TerminateContract() {

    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
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

    public String getRentAmoun() {
        return rentAmoun;
    }

    public void setRentAmoun(String rentAmoun) {
        this.rentAmoun = rentAmoun;
    }

}
