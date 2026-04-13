import java.util.Scanner;

public class BookTrainingSession {

    private final DatabaseRepository repo;

    public BookTrainingSession(DatabaseRepository repo) {
        this.repo = repo;
    }

    public void bookTrainingSession(Scanner sc, String athleteEmail) {
        System.out.println("\n=== Available Sessions for Booking ===");
        repo.viewAllTrainingSessions();

        System.out.print("Enter Session ID to book: ");
        String input = sc.nextLine().trim();

        int sessionID;
        try {
            sessionID = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Session ID. Please enter a number.");
            return;
        }

        repo.bookTrainingSession(sessionID, athleteEmail);
    }
}
