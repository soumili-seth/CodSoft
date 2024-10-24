import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


class Student{

    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name , int rollNumber , String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

    }

    public int getRollnumber(){
        return rollNumber;
    }

    @Override
    public String toString(){
        return "Name: " +name + ", Roll Number: " + rollNumber + " , Grade : " + grade ;
    }

}

    class StudentManagementSystem{
        private List<Student> students;

        public StudentManagementSystem(){
            students = new ArrayList<>();
        }

        public void  addStudent(Student student){
            students.add(student);
        }

        public boolean removeStudent(int rollNumber){
            for (Student student : students){
                if (student.getRollnumber() == rollNumber){
                    students.remove(student);
                    return true;
                }
            }
             return false;
        }

        public Student SearchStudent(int rollNumber) {
            for(Student student : students){
                if(student.getRollnumber() == rollNumber){
                    return student;
                }
            }
        return null;
}

        public List<Student> getAllStudents(){
    return students;
        }
    }

public class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while(true){
            System.out.println("1. Add Student ");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student ");
            System.out.println("4. Display Students");
            System.out.println("5. EXIT");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the Student Name : ");
                    String Name = sc.nextLine();
                    System.out.println("Enter the Roll Number : ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Grade : ");
                    String grade = sc.nextLine();

                    Student newStudent = new Student(Name, rollNumber, grade);
                    sms.addStudent(newStudent);
                    System.out.println(" Student Added ");
                    break;

                case 2:
                    System.out.println("Enter The roll number of the student you want to remove : ");
                    int rolltoRemove = sc.nextInt();
                    boolean removed = sms.removeStudent(rolltoRemove);

                    if(removed){
                        System.out.println("Student Removed");
                    }
                    else{
                        System.out.println("Student not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter the roll number of the student to search : ");
                    int rolltoSearch = sc.nextInt();
                    Student SearchStudent = sms.SearchStudent(rolltoSearch);

                    if(SearchStudent != null){
                        System.out.println("Student Found");
                        System.out.println(SearchStudent);
                    }
                    else{
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    List<Student> allStudents = sms.getAllStudents();
                    if(allStudents.isEmpty()){
                        System.out.println("No students to display");
                    }
                    else{
                        System.out.println("All Students");
                        for (Student student : allStudents){
                            System.out.println(student);
                        }
                    }
                    break;

                case 5:
                    System.out.println("EXITING..");
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

             }
        }

    }
}











