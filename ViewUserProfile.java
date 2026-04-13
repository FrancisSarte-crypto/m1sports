import java.sql.*;

public class ViewUserProfile {

    static final String DB_URL = "jdbc:sqlite:C:/Users/franciskiersarte/Downloads/mitry.db";

    public void view(String email) {

        try (Connection conn = DriverManager.getConnection(DB_URL)) {

            String sql = "SELECT * FROM users WHERE email=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, email);

            ResultSet rs = p.executeQuery();

            if (rs.next()) {
                System.out.println("\n--- PROFILE ---");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Role: " + rs.getString("role"));
                System.out.println("Sport: " + rs.getString("sport_type"));
            } else {
                System.out.println("Profile not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error loading profile.");
        }
    }
}