/**
 * This file was created by josuesencion on 10/21/18
 */

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student studentOne = new Student();

        studentOne.enroll();
        System.out.println(studentOne.courses);
        studentOne.dropCourses();
        System.out.println(studentOne.courses);
    }
}
