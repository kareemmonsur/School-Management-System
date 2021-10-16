package services;

import models.School;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceImplTest {

    private SchoolServices service;

    @BeforeEach
    void setUp() {
        service = new SchoolServiceImpl();
    }

    @Test
    @DisplayName("Add School")
    void add() {
        School school = new School()
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void getAll() {
    }
}