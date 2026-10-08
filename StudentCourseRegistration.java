import java.util.Scanner;

class CourseStudent {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    CourseStudent(String studentName, int rollNumber, double marks,
                  String courseName, int courseCredits) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateScholarship() {

        if (marks >= 85) {
            return 20;
        } else if (marks >= 70) {
            return 10;
        } else {
            return 0;
        }
    }

    double calculateFinalFee() {

        double fee = calculateFee();
        double scholarship = calculateScholarship();

        double scholarshipAmount = fee * scholarship / 100;

        return fee - scholarshipAmount;
    }

    void displayDetails() {

        double fee = calculateFee();
        double scholarship = calculateScholarship();
        double scholarshipAmount = fee * scholarship / 100;
        double finalFee = calculateFinalFee();

        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);

        System.out.println("\n----- Course Details -----");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);

        System.out.println("\nEligibility: Eligible");
        System.out.println("Total Fee: Rs. " + fee);
        System.out.println("Scholarship: " + scholarship + "%");
        System.out.println("Scholarship Amount: Rs. " + scholarshipAmount);
        System.out.println("Final Fee: Rs. " + finalFee);
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner hi = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = hi.nextLine();

        System.out.print("Enter roll number: ");
        int roll = hi.nextInt();

        System.out.print("Enter marks: ");
        double marks = hi.nextDouble();

        hi.nextLine();

        System.out.print("Enter course name: ");
        String course = hi.nextLine();

        System.out.print("Enter course credits: ");
        int credits = hi.nextInt();

        CourseStudent student =
                new CourseStudent(name, roll, marks, course, credits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for course registration.");
            System.out.println("Minimum required marks are 50.");
        }
        hi.close();
    }
}