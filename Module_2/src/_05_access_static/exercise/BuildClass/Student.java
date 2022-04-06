package _05_access_static.exercise.BuildClass;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    protected String setName(String name) {
        return name;
    }

    protected String setClasses(String classes) {
        return classes;
    }
}
