
public interface TenantBuilder {
  TenantBuilder setFirstName(String firstname);

  TenantBuilder setLastname(String lastName);

  TenantBuilder setEmail(String email);

  TenantBuilder setPassword(String password);

  TenantBuilder setid(String id);

  TenantBuilder setPropertyAddress(String address);

  TenantBuilder setMonthlyRent(double rent);

  PropertyTenant build();

}