# BIT1123 Object Oriented Programming — Assignment 1

**Student Name:** Alfatih Mohammed Salih Ali
**Student ID:** 202504010010
**Course:** BIT1123 Object Oriented Programming
**Institution:** City University Malaysia

---

## Assignment Overview

This repository is the submission for Assignment 1 of BIT1123 Object Oriented Programming. It collects the weekly lab tutorial work completed from Week 1 to Week 10 into a single, version-controlled repository.

Each week folder holds the Java source code written for that tutorial, together with any supporting files produced during the session. The repository also contains a self-reflective report (`myreport.pdf`) describing what was learned, which parts were difficult, and how those difficulties were resolved.

The tutorials build on each other. Week 1 sets up the tools, Week 2 introduces the class as a unit of code, and each week after that adds one more object oriented idea on top of the last, ending with a small graphical application in Week 10.

## Course Description

BIT1123 Object Oriented Programming teaches program design using the object oriented model in Java. Rather than writing a program as one long list of instructions, the course teaches how to model a problem as a set of objects that hold their own data and expose their own behaviour.

The lab tutorials in this repository cover the four pillars of OOP in order:

- **Encapsulation** — keeping an object's data private and reaching it only through methods the class controls (Week 5)
- **Inheritance** — building a specialised class on top of a general one so the shared code is written once (Weeks 3–4, 6)
- **Polymorphism** — letting one reference type behave differently depending on the actual object it points to (Weeks 3–4, 7)
- **Abstraction** — defining what a group of classes must be able to do without saying how each one does it (Week 7)

Alongside these, the course covers Java fundamentals (input with `Scanner`, control flow, formatted output), collections (`ArrayList`), file input and output with exception handling, and event-driven GUI programming with Java Swing. Git and GitHub are used throughout as the version control workflow.

## Repository Structure

```
ALFATIH-MOHAMMED-SALIH-ALI_BIT1123-OOP-Assignment-1/
│
├── README.md                   This file
├── myreport.pdf                Self-reflective report
├── LICENSE                     MIT License
├── .gitignore                  Java ignore rules
│
├── week1/
│   ├── HelloWorld.java         First Java program
│   └── StudentGrade.java       Grade calculator using Scanner and if/else
│
├── week2/
│   ├── Student.java            Class with attributes, constructor and methods
│   └── Main.java               Creates a Student object and calls its methods
│
├── week3-4/
│   ├── Person.java             Base class with private name and id
│   ├── Student.java            Subclass, overrides introduce()
│   ├── Lecturer.java           Subclass, overrides introduce()
│   └── Main.java               Demonstrates polymorphism
│
├── week5/
│   ├── Student.java            Fully encapsulated class, getters and setters
│   ├── Main.java               Sets and reads values through methods only
│   └── documentation.txt       Written answers on encapsulation
│
├── week6/
│   ├── Employee.java           Base class with protected fields
│   ├── Lecturer.java           Subclass using super(), adds subject/department
│   └── Main.java               Runs the inherited and the new methods
│
├── week7/
│   ├── Appliance.java          Abstract class plus WashingMachine, Television
│   └── Main.java               Operates each appliance
│
├── week8-9/
│   ├── Main.java               Task manager: ArrayList, file read/write
│   └── task.txt                Sample output file produced by the program
│
└── week10/
    ├── Questions.java          Model class holding one quiz question
    └── QuizBattleGUI.java      Swing GUI with ActionListener event handling
```

## Tutorial Summary

| Week | Main Topics | Exercises / Projects |
|------|-------------|----------------------|
| 1 | GitHub account and repository setup, Codespaces, `.gitignore`, MIT licence, core git commands (`init`, `status`, `add`, `commit`, `push`); first Java program; `Scanner` input, arithmetic, `if`/`else` chains, formatted output | `HelloWorld.java`, `StudentGrade.java` — a grade calculator that reads student details and three subject marks, then computes total, average and letter grade |
| 2 | Writing a class: attributes, constructor, instance methods; creating an object with `new`; calling methods on an object | `Student.java`, `Main.java` — a `Student` class with `name`, `age`, `gpa`, a constructor, `displayInfo()` and `study()`; `Main` creates one student and shows the GPA changing after studying |
| 3–4 | Inheritance with `extends`, calling `super()`, method overriding with `@Override`, runtime polymorphism, private fields with getters | `Person.java`, `Student.java`, `Lecturer.java`, `Main.java` — a university people model where each type introduces itself differently through the same `Person` reference |
| 5 | Encapsulation: the `private` access modifier, getter and setter methods, why direct field access is unsafe | `Student.java`, `Main.java`, `documentation.txt` — a student information system where `studentID`, `name`, `cgpa` and `programme` can only be reached through methods, plus written answers on why |
| 6 | The `protected` modifier, constructor chaining with `super()`, extending a base class with extra state and behaviour | `Employee.java`, `Lecturer.java`, `Main.java` — `Lecturer` inherits ID and name from `Employee` and adds its own subject and department |
| 7 | Abstraction: `abstract class` and `abstract` methods, forcing subclasses to supply an implementation, one common interface for different concrete types | `Appliance.java`, `Main.java` — a smart home system where `Appliance` defines `turnOn()`, `turnOff()` and an abstract `operate()`, implemented differently by `WashingMachine` and `Television` |
| 8–9 | The `ArrayList` collection, enhanced and indexed `for` loops, file output with `BufferedWriter`/`FileWriter`, file input with `BufferedReader`/`FileReader`, try-with-resources and `IOException` handling | `Main.java` — a task manager that reads three tasks from the user, saves them to `task.txt`, then reads the file back and prints it |
| 10 | Java Swing GUI: `JFrame`, `JLabel`, `JButton`, absolute positioning with `setBounds()`, event-driven programming with `ActionListener` and `actionPerformed()`, separating the data model from the interface; cloning a repository locally and pushing back | `Questions.java`, `QuizBattleGUI.java` — the Programming Quiz Battle, a windowed quiz that checks the clicked button against the stored answer and reports the result |

## Technologies Used

| Technology | Used for |
|---|---|
| **Java SE** | All tutorial source code. Only the standard library is used — no external dependencies. Any JDK 8 or newer will compile and run every folder. |
| **Java Swing** (`javax.swing`, `java.awt.event`) | The Week 10 graphical quiz application. |
| **Java Collections** (`java.util.ArrayList`) | The Week 8–9 task manager. |
| **Java I/O** (`java.io`) | File reading and writing in Week 8–9. |
| **Git** | Version control for every tutorial. |
| **GitHub** | Remote hosting of this repository. |
| **GitHub Codespaces** | The browser-based development environment used for the earlier tutorials. |
| **Visual Studio Code** | Local editing after cloning the repository (Week 10). |

No build tool, framework or third-party library is used. Every folder is plain Java and compiles on its own.

## How to Run

Every week folder is self-contained. There are no packages, so compile inside the folder and run the entry class.

**1. Clone the repository**

```bash
git clone https://github.com/qwasdfkl80-ship-it/ALFATIH-MOHAMMED-SALIH-ALI_BIT1123-OOP-Assignment-1.git
```

**2. Compile and run a week**

```bash
cd ALFATIH-MOHAMMED-SALIH-ALI_BIT1123-OOP-Assignment-1/week3-4
javac *.java
java Main
```

**Entry class for each folder**

| Folder | Compile | Run | Notes |
|---|---|---|---|
| `week1` | `javac *.java` | `java HelloWorld` | Prints a greeting and student details |
| `week1` | `javac *.java` | `java StudentGrade` | Prompts for name, ID, course and three marks |
| `week2` | `javac *.java` | `java Main` | |
| `week3-4` | `javac *.java` | `java Main` | |
| `week5` | `javac *.java` | `java Main` | |
| `week6` | `javac *.java` | `java Main` | |
| `week7` | `javac *.java` | `java Main` | |
| `week8-9` | `javac *.java` | `java Main` | Prompts for three tasks, then writes and re-reads `task.txt` in the current folder |
| `week10` | `javac *.java` | `java QuizBattleGUI` | Opens a window; needs a desktop environment |

**Requirements**

- A JDK installed and on the `PATH` (check with `javac -version`)
- Week 10 needs a graphical desktop — it will not run on a headless server
- Week 1 (`StudentGrade`) and Week 8–9 read from the keyboard, so run them in a real terminal

## Learning Summary

The tutorials moved from procedural Java to object oriented design in a deliberate order. Week 1 was about the tools rather than the language: creating the repository, adding a `.gitignore` and a licence, and getting used to committing and pushing. The Java in that week was still procedural — one class, one `main` method, `Scanner` input and an `if`/`else` chain.

Week 2 introduced the actual shift. Instead of putting everything in `main`, a `Student` class held its own data and its own behaviour, and `main` only created the object and asked it to do things.

Weeks 3–4 and 6 covered inheritance from two directions. Weeks 3–4 used a `Person` base class with `private` fields and getters, and showed that three different objects held in the same `Person` reference each run their own `introduce()`. Week 6 used `protected` fields instead, so `Lecturer` could reach `id` and `name` directly, and showed constructor chaining with `super()`.

Week 5 was the encapsulation week: the fields were made `private` and reached only through getters and setters, with the written answers in `documentation.txt` explaining why that matters.

Week 7 completed the four pillars with abstraction. `Appliance` declares `operate()` as `abstract`, which forces every appliance to supply its own version while sharing the same `turnOn()` and `turnOff()`.

Weeks 8–9 stepped away from class design to work with data that outlives the program — `ArrayList` for storing tasks in memory, and file streams with try-with-resources for saving and reloading them.

Week 10 brought it together in a small application. `Questions` holds the data and `QuizBattleGUI` handles the display, which is the same separation practised since Week 2, now applied to a program that reacts to a user clicking a button instead of running top to bottom.

## Reflection Summary

The clearest change across these ten weeks was in how a problem gets broken down. Early on, a new requirement meant adding more lines to `main`. By Week 7 it meant asking which class should own that responsibility.

The parts that took the most work were the ones where the code compiled but the design was wrong. Choosing between `private` and `protected` in Weeks 5 and 6 only made sense after seeing both: `private` with getters keeps the base class in full control, while `protected` trades some of that control for direct access in subclasses. Polymorphism in Weeks 3–4 was similar — the syntax was short, but understanding why `Person p2 = new Student(...)` runs the `Student` version of `introduce()` took working through the example rather than reading about it.

Version control caused its own problems. A duplicate file in the Week 2 folder declared `public class Main` twice in the same directory, which stopped the folder compiling until the duplicate was removed, and a generated `task.txt` was committed to the repository root instead of alongside the code that produced it. Both were fixed while assembling this repository, and both were the result of committing without checking what was actually being added.

The full account is in `myreport.pdf`.

## Repository Information

- **Repository URL:** https://github.com/qwasdfkl80-ship-it/ALFATIH-MOHAMMED-SALIH-ALI_BIT1123-OOP-Assignment-1
- **Default branch:** `main` — contains the complete submission
- **Licence:** MIT (see `LICENSE`)
