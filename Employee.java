package module1;

class Employee {

    private String fName;
    private String lName;
    private int eID;
    private double salary;


    public Employee() {
        fName = null;
        lName = null;
        eID = 0;
        salary = 0.0;

    }

    public void setFName(String fname) { 
        fName = fname;
    }

    public String getFname() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lname) {
        lName = lname;
    }

    public double getEID() {
        return eID;
    }

    public void setEID(int EId) {
        eID = EId;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void EmployeeSummary() { 
        System.out.println("Employee Name: " + fName + " " + lName + " EId :" + eID + " salary: " + salary);
    }
}