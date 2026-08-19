public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "CU12345",
                "Ali",
            3.75,
            "BIT"
        );

        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme  : " + student.getProgramme());
    }
}