class Department {
    private String departmentCode;
    private String departmentName;
    private String building;
    private int yearFounded;

    public Department(String departmentCode){
        this.departmentCode = departmentCode;
    }

    // Getters
    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getBuilding() {
        return building;
    }

    public int getYearFounded(){
        return yearFounded;
    }

    //Setters

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

}