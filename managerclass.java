package module1;


class Manager extends Employee {
    private String dpt;


    public Manager() { 
        super();                         
        dpt = null;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dept) { 
        dpt = dept;
    }

    public void EmployeeSummary() {
        super.EmployeeSummary();     
        System.out.println("Dpt : " + dpt);
    }
}