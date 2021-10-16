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
        School school1 = new School(
                "Gidi Grams",
                "Sport school");
        assertEquals(1, school1.getId());
        School school2 = new School("school of logic",
                "fine school");
        assertEquals(2, school2.getId());
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