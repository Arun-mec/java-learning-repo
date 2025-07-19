package car.autowire.byconstructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details :"+specification.toString());
    }
}
