public class Student {

    // Private attributes: they cannot be touched directly from outside this class.
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    // Setters : the only way in
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // Getters : the only way out
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }
}
