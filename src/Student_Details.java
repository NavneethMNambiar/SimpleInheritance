class Student_Details extends Teaching_Staff {
    private int studentId;
    private String name;
    private String mobileNumber;
    private String email;

    // Constructor
    public Student_Details(int studentId, String departmentCode, int teacherCode) {
        super(teacherCode,departmentCode);
        this.studentId = studentId;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartmentCode() {
        return super.getDepartmentCode();
    }

    public int getTeacherCode() {
        return super.getId();
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }

}