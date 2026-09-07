public class Main {

    public static void main(String[] args) {

        // The same Person reference type is used for all three objects.
        // Java decides which introduce() runs at run time (polymorphism).
        Person p1 = new Person("Alfatih Mohammed Salih Ali", "202504010010");
        Person p2 = new Student("Alfatih Mohammed Salih Ali", "202504010010");
        Person p3 = new Lecturer("Dr Ahmad", "L100");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
