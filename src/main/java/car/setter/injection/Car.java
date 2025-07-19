package car.setter.injection;

public class Car {
    public Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details :"+specification.toString());
    }
}
