package sub;

public class Student extends Person {
    private double gpa;

    // Constructors, getters, setters, toString, and other methods go here

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }
}

