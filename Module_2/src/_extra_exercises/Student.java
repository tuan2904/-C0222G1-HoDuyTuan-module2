package _extra_exercises;

public class Student extends Person {
    int point;

    public Student(int point) {
        this.point = point;
    }

    public Student(String name, int age, boolean gender, int point) {
        super(name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student " +
                "{ point= " + point +
                super.toString()+
                '}' ;
    }
}
