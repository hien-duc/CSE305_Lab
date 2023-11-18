// package main;


public class PropertyTenant {

    //Data members{
    protected String tenantID;
    protected String leaseAgreement;
    protected String payment;
    protected String retialProperty;
    protected double maintenanceRequests;

    //Constructors
    public PropertyTenant() {

    }

    public PropertyTenant(String tenantID, String leaseAgreement, String payment, String retialProperty, double maintenanceRequests) {
        this.tenantID = tenantID;
        this.leaseAgreement = leaseAgreement;
        this.payment = payment;
        this.retialProperty = retialProperty;
        this.maintenanceRequests = maintenanceRequests;
    }

    //Methods
    public void CreateRentalContract() {

    }

    public void TerminateRentalContract() {

    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public String getLeaseAgreement() {
        return leaseAgreement;
    }

    public void setLeaseAgreement(String leaseAgreement) {
        this.leaseAgreement = leaseAgreement;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRetialProperty() {
        return retialProperty;
    }

    public void setRetialProperty(String retialProperty) {
        this.retialProperty = retialProperty;
    }

    public double getMaintenanceRequests() {
        return maintenanceRequests;
    }

    public void setMaintenanceRequests(double maintenanceRequests) {
        this.maintenanceRequests = maintenanceRequests;
    }

}
