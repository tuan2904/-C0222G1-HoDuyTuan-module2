package _extra_exercises;

public class Teacher extends Person {
    int salary;

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, boolean gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher { " +
                " salary= " + salary +
                super.toString()
                + '}';
    }
}
