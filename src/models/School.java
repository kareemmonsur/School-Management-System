package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long ID;
    private String Name;
    private String description;
    private SchoolType type;
    private Address address;
    List<Class> classes = new ArrayList<>();
    List<Staff> staffs = new ArrayList<>();
    List<Student> students = new ArrayList<>();

}
