import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] marks1 = {90, 85, 88, 92};
        Student_Marks studentMarks1 = new Student_Marks(202001,"DEPT001",101,1,marks1);
        System.out.println("Student : " + studentMarks1.getStudentId());
        System.out.println("Department : " + studentMarks1.getDepartmentCode());
        System.out.println("Teacher : " + studentMarks1.getTeacherCode());
        System.out.println("Semester: " + studentMarks1.getSemesterNumber());
        System.out.println("Marks in 4 Subjects: " + Arrays.toString(studentMarks1.getMarks()));
        System.out.println("Average Marks in 4 Subjects: " + studentMarks1.getAverage());
        System.out.println();


        int[] marks2 = {60,70,80,90};
        Student_Marks studentMarks2 = new Student_Marks(202002,"DEPT002",102,1,marks2);
        System.out.println("Student : " + studentMarks2.getStudentId());
        System.out.println("Department : " + studentMarks2.getDepartmentCode());
        System.out.println("Teacher : " + studentMarks2.getTeacherCode());
        System.out.println("Semester: " + studentMarks2.getSemesterNumber());
        System.out.println("Marks in 4 Subjects: " + Arrays.toString(studentMarks2.getMarks()));
        System.out.println("Average Marks in 4 Subjects: " + studentMarks2.getAverage());
        System.out.println();


        int[] marks3 = {90,92,99,80};
        Student_Marks studentMarks3 = new Student_Marks(202003,"DEPT003",103,1,marks3);
        System.out.println("Student : " + studentMarks3.getStudentId());
        System.out.println("Department : " + studentMarks3.getDepartmentCode());
        System.out.println("Teacher : " + studentMarks3.getTeacherCode());
        System.out.println("Semester: " + studentMarks3.getSemesterNumber());
        System.out.println("Marks in 4 Subjects: " + Arrays.toString(studentMarks3.getMarks()));
        System.out.println("Average Marks in 4 Subjects: " + studentMarks3.getAverage());
        System.out.println();


        int[] marks4 = {40,50,55,90};
        Student_Marks studentMarks4 = new Student_Marks(202004,"DEPT004",104,1,marks4);
        System.out.println("Student : " + studentMarks4.getStudentId());
        System.out.println("Department : " + studentMarks4.getDepartmentCode());
        System.out.println("Teacher : " + studentMarks4.getTeacherCode());
        System.out.println("Semester: " + studentMarks4.getSemesterNumber());
        System.out.println("Marks in 4 Subjects: " + Arrays.toString(studentMarks4.getMarks()));
        System.out.println("Average Marks in 4 Subjects: " + studentMarks4.getAverage());
        System.out.println();


        int[] marks5 = {70,72,78,75};
        Student_Marks studentMarks5 = new Student_Marks(202005,"DEPT005",105,1,marks5);
        System.out.println("Student : " + studentMarks5.getStudentId());
        System.out.println("Department : " + studentMarks5.getDepartmentCode());
        System.out.println("Teacher : " + studentMarks5.getTeacherCode());
        System.out.println("Semester: " + studentMarks5.getSemesterNumber());
        System.out.println("Marks in 4 Subjects: " + Arrays.toString(studentMarks5.getMarks()));
        System.out.println("Average Marks in 4 Subjects: " + studentMarks5.getAverage());
    }
}
