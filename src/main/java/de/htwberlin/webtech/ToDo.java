package de.htwberlin.webtech;

public class ToDo {

    private String title;
    private String description;
    private boolean completed;

    public ToDo(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    // Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
