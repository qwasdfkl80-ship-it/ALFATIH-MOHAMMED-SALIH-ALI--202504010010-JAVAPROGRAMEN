public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        // The values can only be set through the setters.
        s1.setStudentID("CU12345");
        s1.setName("Ali");
        s1.setCGPA(3.75);
        s1.setProgramme("BIT");

        // The values can only be read through the getters.
        System.out.println("Student ID : " + s1.getStudentID());
        System.out.println("Name       : " + s1.getName());
        System.out.println("CGPA       : " + s1.getCGPA());
        System.out.println("Programme: " + s1.getProgramme());
    }
}
