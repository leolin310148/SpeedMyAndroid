package me.leolin.speedme.sample;

/**
 * @author Leolin
 */
public class Student {

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
