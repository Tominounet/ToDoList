package com.neosoft.training.services;

import com.neosoft.training.model.Tags;
import com.neosoft.training.model.Task;
import com.neosoft.training.model.User;

import java.util.ArrayList;
import java.util.List;

public class RepositoryHandler {
    private List<Task> repositoryTask = new ArrayList<>();
    private List<User> repositoryUser = new ArrayList<>();
    private List<Tags> repositoryTags = new ArrayList<>();

    public void addTask(Task task) {
        repositoryTask.add(task);
    }
    public void addUser(User user) {
        repositoryUser.add(user);
    }
    public void addTags(Tags tag) {
        repositoryTags.add(tag);
    }

    public void removeTask(Task task) {
        repositoryTask.remove(task);
    }
    public void removeUser(User user) {
        repositoryUser.remove(user);
    }
    public void removeTags(Tags tag) {
        repositoryTags.remove(tag);
    }
}
