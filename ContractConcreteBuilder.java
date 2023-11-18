
public class ContractConcreteBuilder implements ContractBuilder {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private Long startDate;
    private Long endDate;
    private double rentAmount;

    @Override
    public ContractBuilder setContractID(int contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public ContractBuilder setPropertyID(int propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public ContractBuilder setTenantID(int tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public ContractBuilder setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public ContractBuilder setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public ContractBuilder setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract build() {
        return new Contract(contractID, propertyID, tenantID, startDate, endDate, rentAmount);
    }

}