package com.neosoft.training.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {

    private User userTest;

    @BeforeEach
    void setup() {
        userTest = new User("Richard", "Tom", "trichard.dev@gmail.com");
    }

    @Test
    @DisplayName("check initials are good")
    void test1() {
        org.junit.jupiter.api.Assertions.assertEquals("TR", userTest.getInitials());
    }

    @Test
    void checkFormatOfMail() {
        Assertions.assertThat(userTest.getMail())
                .matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    @Test
    void checkWrongFormatOfMail() {
        User user = new User("Richard", "Tom", "bliblablou");
        Assertions.assertThat(user.getMail())
                  .doesNotMatch("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    @Test
    void checkDateCreationSetToCurrentDay() {
        LocalDate currentDay = LocalDate.now();
        Assertions.assertThat(userTest.getDateCreation())
                .hasDayOfMonth(currentDay.getDayOfMonth())
                .hasMonth(currentDay.getMonth())
                .hasYear(currentDay.getYear());
    }
}
