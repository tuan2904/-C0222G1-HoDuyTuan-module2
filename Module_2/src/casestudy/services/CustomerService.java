package casestudy.services;

public interface CustomerService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void edit();
}
