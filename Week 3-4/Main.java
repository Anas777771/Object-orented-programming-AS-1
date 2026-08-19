public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ali", "P100");
        Person p2 = new Student("Ahmed", "S100");
        Person p3 = new Lecturer("Dr Ahmad", "L100");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

class Person {
    protected final String name;
    protected final String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void introduce() {
        System.out.println("I am " + name + " (" + id + ")");
    }
}

class Student extends Person {
    Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void introduce() {
        System.out.println("I am student " + name + " (" + id + ")");
    }
}

class Lecturer extends Person {
    Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void introduce() {
        System.out.println("I am lecturer " + name + " (" + id + ")");
    }
}