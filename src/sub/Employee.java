package sub;

public class Employee extends Person {
    private String position;
    private double salary;

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}
