package com.neosoft.training.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskTest {

    @Test
    void checkPriorityCalcul() {
        Task mockedTask = mock(Task.class);

        mockedTask.getEstimatedDuration();

    }
}
