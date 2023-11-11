public class user {

  private int userId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public user(int userId, String firstName, String lastName, String email, String password) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.password = password;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean Register() {
    return true;
  }

  public boolean Login(String id, String firstName, String email, String password) {
    return true;
  }

  public String Update(String id, String firstName, String email) {
    String string = "id=" + id + ", firstName=" + firstName + ", email=" + email + ", password=" + password;
    return string;
  }

  public String ResetPassword(String id) {
    String string = " ";
    return string;
  }

}