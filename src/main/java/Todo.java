public class Todo extends Task {
    public Todo(String description, boolean isDone) {
        super(description);
        if (isDone) markAsDone();
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toFileFormat() {
        return "T | " + (isDone() ? "1" : "0") + " | " + getDescription();
    }
}
