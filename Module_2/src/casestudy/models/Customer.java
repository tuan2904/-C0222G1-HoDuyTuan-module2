package casestudy.models;

public class Customer extends Person {
    public Customer() {
    }

    public Customer(int id, String name, int age, String gender, int address) {
        super(id, name, age, gender, address);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
