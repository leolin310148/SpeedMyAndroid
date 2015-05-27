package me.leolin.speedme.sample;

/**
 * @author Leolin
 */
public class Student {

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
