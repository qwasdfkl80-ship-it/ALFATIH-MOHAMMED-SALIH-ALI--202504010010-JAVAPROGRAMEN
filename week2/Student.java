public class Student {
    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    public Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Method to simulate studying
    public void study() {
        System.out.println(name + " is studying...");
        gpa += 0.1; // Example: studying improves GPA
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, 3.5);

        s1.displayInfo();
        s1.study();
        s1.displayInfo();
    }
}