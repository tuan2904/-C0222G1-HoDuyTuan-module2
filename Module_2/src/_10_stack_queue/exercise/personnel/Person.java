package _10_stack_queue.exercise.personnel;

public class Person implements Comparable<Person> {
    private String name;
    private boolean gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge()){
            return 1;
        } else if(this.getAge() < o.getAge()){
            return -1;
        } else {
            return 0;
        }
    }
//    @Override
//    public int compareTo(Person o) {
//        return Integer.compare(this.getAge(), o.getAge());
//    }
}
