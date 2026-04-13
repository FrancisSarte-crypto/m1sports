public class User {
    private final String name;
    private final String email;
    private final String role;
    private final String sportType;

    public User(String name, String email, String role, String sportType) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.sportType = sportType;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
    public String getSportType() { return sportType; }
}