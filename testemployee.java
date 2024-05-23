package module1;

class TestEmployee {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setFName("Samantha");
        mgr.setLName("McCurtain");
        mgr.setEID(671422);
        mgr.setSalary(7000);
        mgr.setDpt("Inventory");
        mgr.EmployeeSummary();
        }
        }