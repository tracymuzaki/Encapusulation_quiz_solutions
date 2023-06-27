//1.Write a java program to create a class called student  with private instance variables student_id ,student _name and grades
//provide a public getter and setter methods to access and modify the student_id and student name variables.
//however provide a method called addGrade that allows adding a grade to the grades variable while performing additional validation
import java.util.ArrayList;
import java.util.List;
//created a class called Student
public class Student {
    //private instance variables student_id ,student _name and grades
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    //Used a class constructor to initialise the class variables
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    //public getter and setter methods to access and modify the student_id and student name variables
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }


    //created the method addGrade to allow adding a grade to the grades variable while performing additional validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Add grade: " + grade);
        } else {
            System.out.println("Grade should be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        // Created objects of the Student class
        Student student = new Student(1, "Adudi Flavia");
        Student student2 = new Student(2, "Allen Muzaki");
        // used method addGrade to add the student's grades to the grades variable
        //for first student
        student.addGrade(60);
        student.addGrade(80);
        student.addGrade(110); // outputs the else part
        //for second student
        student2.addGrade(100);
        student2.addGrade(50);
        //output before modifying first student's information
        System.out.println("\nBefore modifying: ");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grades: " + student.grades);
        //second student's information
        System.out.println("\nStudent ID: " + student2.getStudentId());
        System.out.println("Student Name: " + student2.getStudentName());
        System.out.println("Student Grades: " + student2.grades);
        //output after modifying first student's information
        System.out.println("\nAfter modifying");
        student.setStudentId(4);
        student.setStudentName("Edna Floren");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grades: " + student.grades);
        //second student's information
        System.out.println("\nStudent ID: " + student2.getStudentId());
        System.out.println("Student Name: " + student2.getStudentName());
        System.out.println("Student Grades: " + student2.grades);
    }


}

