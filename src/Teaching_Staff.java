class Teaching_Staff extends Department{
    private int id;
    private String name;
    private String qualification;
    private String dateOfJoining;


    // Constructor
    public Teaching_Staff(int id, String departmentCode) {
        super(departmentCode);
        this.id = id;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getDepartmentCode() {
        return super.getDepartmentCode();
    }

    public void setName(String name){
        this.name=name;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public void setDateOfJoining(String dateOfJoining){
        this.dateOfJoining = dateOfJoining;
    }

}