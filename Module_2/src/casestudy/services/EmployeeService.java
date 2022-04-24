package casestudy.services;

public interface EmployeeService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void edit();

    @Override
    void delete();
}
