public class AirConditioner extends Appliances {

    public AirConditioner(String brand) {

        super(brand);
    }

    @Override
    public void operate() {

        System.out.println("Cooling room...");
    }
}