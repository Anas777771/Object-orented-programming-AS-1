public class StudentGrade {

    public static void main(String[] args) {

        String studentName = "Ali";
        double grade = 85.5;

        System.out.println("Student Name : " + studentName);
        System.out.println("Grade        : " + grade);

        if (grade >= 80) {
            System.out.println("Result       : A");
        } else if (grade >= 70) {
            System.out.println("Result       : B");
        } else if (grade >= 60) {
            System.out.println("Result       : C");
        } else if (grade >= 50) {
            System.out.println("Result       : D");
        } else {
            System.out.println("Result       : F");
        }
    }
}