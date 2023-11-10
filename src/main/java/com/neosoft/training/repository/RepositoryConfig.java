package com.neosoft.training.repository;

import com.neosoft.training.model.Tags;
import com.neosoft.training.model.Task;
import com.neosoft.training.model.User;

public enum RepositoryConfig {
    USER(User.class, UserRepository.class),
    TASK(Task.class, TaskRepository.class),
    TAGS(Tags.class, TagsRepository.class);

    private final Class model;
    private final Class repository;
    RepositoryConfig(Class model, Class repository) {
        this.model = model;
        this.repository = repository;
    }
}
