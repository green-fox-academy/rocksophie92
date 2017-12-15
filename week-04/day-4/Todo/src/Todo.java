import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

public class Todo implements Serializable {

  private String description;
  private String deadline;
  private int importance;
  private boolean isDone;

  public Todo() {
  }

  public Todo(String description, String deadline, int importance) {
    this.description = description;
    this.deadline = deadline;
    this.importance = importance;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }

  public void setImportance(int importance) {
    this.importance = importance;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public String getDescription() {
    return description;
  }

  public String getDeadline() {
    return deadline;
  }

  public int getImportance() {
    return importance;
  }

  public boolean isDone() {
    return isDone;
  }

  @Override
  public String toString() {
    return
            " description = " + description + ", " +
            "deadline = " + deadline + ", " +
            "importance = " + importance + ", " +
            "isDone = " + isDone;
  }
}
