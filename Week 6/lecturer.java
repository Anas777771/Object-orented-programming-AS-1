public class lecturer extends employee {

    private String subject;

    // Constructor
    public lecturer(String id, String name, String subject) {

        super(id, name);
        this.subject = subject;
    }

    // Display subject
    public void displaySubject() {

        System.out.println("Subject     : " + subject);
    }
}