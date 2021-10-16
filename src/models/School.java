package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long Id;
    private String Name;
    private String description;
    private SchoolType type;
    private Address address;
    List<Class> classes = new ArrayList<>();
    List<Staff> staffs = new ArrayList<>();
    List<Student> students = new ArrayList<>();


    private static long count = 0;

    public School( String name, String description, SchoolType type) {
        this.Id = ++ count;
        Name = name;
        this.description = description;
        this.type = type;
    }
    public School(){
      //  this.Id = ++ count;

    }

    public School(String name, String description) {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }
}
