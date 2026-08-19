public class Main {

    public static void main(String[] args) {

        Appliances appliance1 =
                new WashingMachine("LG");

        appliance1.displayBrand();
        appliance1.turnOn();
        appliance1.operate();
        appliance1.turnOff();

        System.out.println();

        Appliances appliance2 =
                new Refrigerator("Panasonic");

        appliance2.displayBrand();
        appliance2.turnOn();
        appliance2.operate();
        appliance2.turnOff();
    }
}