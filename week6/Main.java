public class Main {

    public static void main(String[] args) {

        Lecturer l1 = new Lecturer("L100", "Dr Ahmad",
                "Java Programming", "Faculty of Information Technology");

        // displayInfo() is inherited from Employee.
        l1.displayInfo();

        // displaySubject() is Lecturer's own method.
        l1.displaySubject();
    }
}
