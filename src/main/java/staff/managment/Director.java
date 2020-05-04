package staff.managment;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String departmentName, double budget) {
        super(name, nationalInsuranceNumber, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return getSalary() * 0.02;
    }
}
