import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    public List<String> courses; //make it public for now
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    private final Scanner scanner = new Scanner(System.in);

    //Constructor
    public Student() {
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshmen\n2 - " +
                "Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = Integer.parseInt(scanner.nextLine());
        setStudentID();
        System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear
                + " " + this.studentID);

    }

    //Generate Student ID
    private void setStudentID() {
        //Grade level + ID
        this.id++;
        this.studentID = this.gradeYear + "" + this.id;
    }

    //Course enrollment method
    public void enroll() {
        if (this.courses == null) {
            this.courses = new ArrayList<>();
        }

        if (this.courses.size() < 5) {
            System.out.println("Available courses:\n1. History 101\n2. Mathematics 101\n" +
                    "3. English 101\n4. Chemistry 101\n5. Computer Science 101");
            System.out.print("Enter the number(s) corresponding to the course(s) you want" +
                    "to register for: ");
            String[] courseNumbers = scanner.nextLine().split(" ", 5);

            for (String courseNumber :
                    courseNumbers) {
                int courseNum = Integer.parseInt(courseNumber);

                if (courseNum == 1) {
                    if (this.courses.contains("History 101")) {
                        System.out.println("You already registered for History 101");
                    } else {
                        this.courses.add("History 101");
                    }
                } else if (courseNum == 2) {
                    if (this.courses.contains("Mathematics 101")) {
                        System.out.println("You already registered for Mathematics 101");
                    } else {
                        this.courses.add("Mathematics 101");
                    }
                } else if (courseNum == 3) {
                    if (this.courses.contains("English 101")) {
                        System.out.println("You already registered for English 101");
                    } else {
                        this.courses.add("English 101");
                    }
                } else if (courseNum == 4) {
                    if (this.courses.contains("Chemistry 101")) {
                        System.out.println("You already registered for Chemistry 101");
                    } else {
                        this.courses.add("Chemistry 101");
                    }
                } else {
                    if (this.courses.contains("Computer Science 101")) {
                        System.out.println("You already registered for Computer Science 101");
                    } else {
                        this.courses.add("Computer Science 101");
                    }
                }
            }
        } else {
            System.out.println("You can only register for 5 courses!");
        }
    }

    //Drop Courses
    public void dropCourses() {
        System.out.println("These are the courses your are registered for: ");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i + 1 + ". " + courses.get(i));
        }

        System.out.print("Enter the number(s) corresponding to the course(s) you want to drop out of: ");
        String[] coursesDropNumbers = scanner.nextLine().split(" ", 5);
        String[] courseNames = new String[coursesDropNumbers.length];

        for (int i = 0; i < coursesDropNumbers.length; i++) {
            int index = Integer.parseInt(coursesDropNumbers[i]) - 1;
            courseNames[i] = courses.get(index);
        }

        for (String courseName :
                courseNames) {
            courses.remove(courseName);
        }
        System.out.println("Done!");
    }
}























