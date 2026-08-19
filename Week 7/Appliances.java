public abstract class Appliances {

    protected String brand;

    // Constructor
    public Appliances(String brand) {

        this.brand = brand;
    }

    // Display brand
    public void displayBrand() {

        System.out.println("Brand : " + brand);
    }

    // Turn appliance on
    public void turnOn() {

        System.out.println("Power ON");
    }

    // Turn appliance off
    public void turnOff() {

        System.out.println("Power OFF");
    }

    // Abstract method
    public abstract void operate();
}