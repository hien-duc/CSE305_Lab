public class ConcreteTenants implements TenantBuilder {
  protected String userId;
  protected String firstName;
  protected String lastName;
  protected String email;
  protected String password;
  protected String address;
  protected double rent;

  @Override
  public TenantBuilder setFirstName(String firstname) {
    this.firstName = firstname;
    return this;
  }

  @Override
  public TenantBuilder setLastname(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @Override
  public TenantBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  @Override

  public TenantBuilder setPassword(String password) {
    this.password = password;
    return this;
  }

  @Override
  public TenantBuilder setid(String id) {
    this.userId = id;
    return this;
  }

  @Override
  public TenantBuilder setMonthlyRent(double rent) {
    this.rent = rent;
    return this;

  }

  @Override
  public TenantBuilder setPropertyAddress(String address) {
    this.address = address;
    return this;
  }

  @Override
  public PropertyTenant build() {
    return new PropertyTenant(userId, firstName, lastName, email, password,address, rent);
  }

}