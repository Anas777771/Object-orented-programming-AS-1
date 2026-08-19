class Main {

    public static void main(String[] args) {

        lecturer lecturer1 = new lecturer(
                "L100",
                "Dr Ahmad",
                "Java Programming"
        );

        lecturer1.setDepartment(
                "Faculty of Information Technology"
        );

        lecturer1.displayInfo();
        lecturer1.displaySubject();
        lecturer1.displayDepartment();
    }
}