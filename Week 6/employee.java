public class employee {

    protected String id;
    protected String name;
    protected String department;

    // Constructor
    public employee(String id, String name) {

        this.id = id;
        this.name = name;
    }

    // Display employee information
    public void displayInfo() {

        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
    }

    // Set department
    public void setDepartment(String department) {

        this.department = department;
    }

    // Display department
    public void displayDepartment() {

        System.out.println("Department  : " + department);
    }
}