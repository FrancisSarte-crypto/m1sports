public class ViewTrainingSession {

    private final DatabaseRepository repo;

    public ViewTrainingSession(DatabaseRepository repo) {
        this.repo = repo;
    }

    public void viewTrainingSessions() {
        System.out.println("\n=== Available Training Sessions ===");
        repo.viewAllTrainingSessions();
    }
}