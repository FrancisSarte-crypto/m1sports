public class ViewAvailableSession {

    private final DatabaseRepository repo;

    public ViewAvailableSession(DatabaseRepository repo) {
        this.repo = repo;
    }

    public void viewTrainingSession() {
        repo.bookTrainingSession();
    }
}