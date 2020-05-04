package staff.managment;

import staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String nationalInsuranceNumber, double salary, String departmentName) {
        super(name, nationalInsuranceNumber, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

}
