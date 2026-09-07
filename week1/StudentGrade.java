import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.println("=== STUDENT GRADE CALCULATOR ===");

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Course Name: ");
        String course = input.nextLine();

      
        System.out.print("Enter mark for Subject 1: ");
        double s1 = input.nextDouble();

        System.out.print("Enter mark for Subject 2: ");
        double s2 = input.nextDouble();

        System.out.print("Enter mark for Subject 3: ");
        double s3 = input.nextDouble();


        
        double total = s1 + s2 + s3;
        double average = total / 3.0;


        char grade;

        if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        
      
        System.out.println("\n=== RESULT SUMMARY ===");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Course       : " + course);

        System.out.println("\nMarks Entered:");
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);

        System.out.println("\nTotal Marks : " + total);
        System.out.println("Average     : " + String.format("%.2f", average));
        System.out.println("Final Grade : " + grade);


        input.close();
    }
}
