import java.util.Scanner;

public class CancelReservation {

    private final DatabaseRepository repo;

    public CancelReservation(DatabaseRepository repo) {
        this.repo = repo;
    }

    public void cancelReservation(Scanner sc, String athleteEmail) {
        System.out.println("\n=== Cancel Reservation ===");

        repo.viewMyReservations(athleteEmail);

        System.out.print("Enter Reservation ID to cancel: ");
        String reservationID = sc.nextLine().trim();

        if (reservationID.isEmpty()) {
            System.out.println("Reservation ID cannot be empty.");
            return;
        }

        boolean success = repo.cancelReservation(reservationID, athleteEmail);

        if (success) {
            System.out.println("Reservation cancelled successfully.\n");
        } else {
            System.out.println("Failed to cancel reservation. Please check the ID.\n");
        }
    }
}
