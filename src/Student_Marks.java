class Student_Marks extends Student_Details{
    private int semesterNumber;
    private int[] marks;

    // Constructor
    public Student_Marks(int studentId, String departmentCode, int teacherCode, int semesterNumber, int[] marks) {
        super(studentId,departmentCode,teacherCode);
        this.semesterNumber = semesterNumber;
        this.marks = marks;
    }

    // Getters
    public int getStudentId() {
        return super.getStudentId();
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAverage(){
        int totalMarks=0,totalSubjects=0;
        for (int mark: marks) {
            totalMarks+=mark;
            totalSubjects+=1;
        }
        return totalMarks/totalSubjects;
    }

}