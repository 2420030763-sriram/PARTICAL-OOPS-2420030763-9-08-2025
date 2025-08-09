import java.util.*;

public class Student {
    private long rollNumber;    
    public String name;        

    public void setDetails(long rollNumber, String grade, String name) {
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Create an object of Student
        Student s1 = new Student();
        
        // Set student details
        s1.setDetails(2420030763L, "A", "SRIRAMA KRISHNAJI");
        
        // Show student details
        s1.showDetails();
    }
}
