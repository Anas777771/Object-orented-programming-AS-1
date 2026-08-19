public class Main {

    public static void main(String[] args) {

        // Air Conditioner
        Appliances airConditioner =
                new Appliances("LG") {

                    @Override
                    public void operate() {
                        System.out.println("Cooling room...");
                    }
                };

        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        // Washing Machine
        Appliances washingMachine =
                new Appliances("Panasonic") {

                    @Override
                    public void operate() {
                        System.out.println("Washing clothes...");
                    }
                };

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        // Microwave
        Appliances microwave =
                new Appliances("Samsung") {

                    @Override
                    public void operate() {
                        System.out.println("Heating food...");
                    }
                };

        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();

        System.out.println();

        // Television
        Appliances television =
                new Appliances("Sony") {

                    @Override
                    public void operate() {
                        System.out.println("Playing television...");
                    }
                };

        television.displayBrand();
        television.turnOn();
        television.operate();
        television.turnOff();

        System.out.println();

        // Refrigerator
        Appliances refrigerator =
                new Appliances("LG") {

                    @Override
                    public void operate() {
                        System.out.println("Cooling food...");
                    }
                };

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}