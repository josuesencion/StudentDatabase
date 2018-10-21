/**
 * This file was created by josuesencion on 10/21/18
 */

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.enroll();
        System.out.println(student1.courses);
        student1.dropCourses();
        System.out.println(student1.courses);




    }
}
