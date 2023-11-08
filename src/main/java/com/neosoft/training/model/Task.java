package com.neosoft.training.model;

import com.neosoft.training.strategy.DurationStrategy;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Task {
    private String title;
    private Priority priority = Priority.UNDEFINED;
    private DurationStrategy durationStrategy = DurationStrategy.DEFINED_TASK;
    private String description = "";
    private Tags[] tags;
    private int estimatedDuration = 0;
    private User userCreation;
    private User userModification;
    private LocalDateTime datetimeCreation;
    private LocalDateTime datetimeModification;


    public Task(String title, User userCreation) {
        this.title = title;
        this.userCreation = this.userModification = userCreation;
        this.datetimeCreation = this.datetimeModification = LocalDateTime.now();
    }

    public Task(String title, String description, User userCreation) {
        this.title = title;
        this.description = description;
        this.userCreation = this.userModification = userCreation;
        this.datetimeCreation = this.datetimeModification = LocalDateTime.now();
    }

    public Task(String title, String description, Priority priority, User userCreation) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.userCreation = this.userModification = userCreation;
        this.datetimeCreation = this.datetimeModification = LocalDateTime.now();
    }

    public Task(String title, String description, Priority priority, User userCreation, Tags[] tags) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.tags = tags;
        this.userCreation = this.userModification = userCreation;
        this.datetimeCreation = this.datetimeModification = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tags[] getTags() {
        return tags;
    }

    public void setTags(Tags[] tags) {
        this.tags = tags;
    }

    public User getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(User userCreation) {
        this.userCreation = userCreation;
    }

    public User getUserModification() {
        return userModification;
    }

    public void setUserModification(User userModification) {
        this.userModification = userModification;
    }

    public LocalDateTime getDatetimeCreation() {
        return datetimeCreation;
    }

    public void setDatetimeCreation(LocalDateTime datetimeCreation) {
        this.datetimeCreation = datetimeCreation;
    }

    public LocalDateTime getDatetimeModification() {
        return datetimeModification;
    }

    public void setDatetimeModification(LocalDateTime datetimeModification) {
        this.datetimeModification = datetimeModification;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public DurationStrategy getDurationStrategy() {
        return durationStrategy;
    }

    public void setDurationStrategy(DurationStrategy durationStrategy) {
        this.durationStrategy = durationStrategy;
    }

    public int duration() {
        return this.durationStrategy.getCalcul().apply(this.estimatedDuration);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", userCreation=" + userCreation +
                ", userModification=" + userModification +
                ", datetimeCreation=" + datetimeCreation +
                ", datetimeModification=" + datetimeModification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getTitle(), task.getTitle()) && getPriority() == task.getPriority() && Objects.equals(getDescription(), task.getDescription()) && Arrays.equals(getTags(), task.getTags()) && Objects.equals(getUserCreation(), task.getUserCreation()) && Objects.equals(getUserModification(), task.getUserModification()) && Objects.equals(getDatetimeCreation(), task.getDatetimeCreation()) && Objects.equals(getDatetimeModification(), task.getDatetimeModification());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getTitle(), getPriority(), getDescription(), getUserCreation(), getUserModification(), getDatetimeCreation(), getDatetimeModification());
        result = 31 * result + Arrays.hashCode(getTags());
        return result;
    }
}
