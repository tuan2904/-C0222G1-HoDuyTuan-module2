package casestudy.models;

public class Employee extends Person {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String email, String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id,
                    String name,
                    int age,
                    String gender,
                    int address,
                    String email,
                    String level,
                    String position,
                    int salary) {
        super(id, name, age, gender, address);
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "id: " +
                + getId() +
                "name: " + getName()
                + "age: " + getAge() +
                "gender: " + getGender() +
                "CMND: " + getAddress() +
                "email: " + email +
                "level: " + level +
                " position: " + position +
                "salary: " + salary;
    }
}
