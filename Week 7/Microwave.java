public class Microwave extends Appliances {

    public Microwave(String brand) {

        super(brand);
    }

    @Override
    public void operate() {

        System.out.println("Heating food...");
    }
}