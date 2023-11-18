public interface UsersBuilder {
    UsersBuilder setFirstName(String firstname);

    UsersBuilder setLastname(String lastName);

    UsersBuilder setEmail(String email);

    UsersBuilder setPassword(String password);

    UsersBuilder setid(String id);

    User build();

}
