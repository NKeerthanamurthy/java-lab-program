package javaact;

class Car {
    String make;
    String model;
    int year;
    Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    void updateMake(String make) {
        this.make = make;
    }
    void updateModel(String model) {
        this.model = model;
    }

    void updateYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Details:");
        myCar.displayDetails();
        myCar.updateMake("Toyota");
        myCar.updateModel("Camry");
        myCar.updateYear(2020);
        System.out.println("\nUpdated Car Details:");
        myCar.displayDetails();
    }
}
