public class Lecturer {

    private final String name;
    private final String id;

    public Lecturer(String name, String id) {

        this.name = name;
        this.id = id;
    }

    public void introduce() {

        System.out.println("I am " + name + ", a lecturer.");
    }

    public String getId() {

        return id;
    }
}