public class Television extends Appliances {

    public Television(String brand) {

        super(brand);
    }

    @Override
    public void operate() {

        System.out.println("Playing television...");
    }
}