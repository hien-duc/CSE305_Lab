
public interface ContractBuilder {

    ContractBuilder setContractID(int contractID);

    ContractBuilder setPropertyID(int propertyID);

    ContractBuilder setTenantID(int tenantID);

    ContractBuilder setStartDate(Long startDate);

    ContractBuilder setEndDate(Long endDate);

    ContractBuilder setRentAmount(double rentAmount);

    Contract build();

}
