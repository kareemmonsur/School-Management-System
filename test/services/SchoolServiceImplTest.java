package services;

import db.SchoolDb;
import models.School;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceImplTest {

    private SchoolServices service;
    private SchoolDb schoolDb;

    @BeforeEach
    void setUp() {
        schoolDb = new SchoolDb();
        service = new SchoolServiceImpl( schoolDb);

    }

    @Test
    @DisplayName("Add School")
    void add() {
        School school1 = new School("Gidi Grams", "Sport school");
        assertEquals(1, school1.getId());
        School school2 = new School("school of logic", "fine school");
       // assertEquals(2, school2.getId());
        School school3 = new School("school of agric", "fine school");
       // assertEquals(3, school3.getId());
        service.addAll(school1, school2, school3);
        assertEquals(3, schoolDb.getAll().size());
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