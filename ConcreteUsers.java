/**
 * ConcreteUsers
 */

public class ConcreteUsers implements UsersBuilder {
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;

    @Override
    public UsersBuilder setFirstName(String firstname) {
        this.firstName = firstname;
        return this;
    }

    @Override
    public UsersBuilder setLastname(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UsersBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override

    public UsersBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public UsersBuilder setid(String id) {
        this.userId = id;
        return this;
    }

    @Override
    public User build() {
        return new User(userId, firstName, lastName, email, password);
    }

}