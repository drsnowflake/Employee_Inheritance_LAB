import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Alex John", "J2345673W", 30000, "Management");
    }

    @Test
    public void hasName() {
        assertEquals("Alex John", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("J2345673W", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary(),0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Management", manager.getDepartmentName());
    }

    @Test
    public void CanRaiseSalary() {
        manager.raiseSalary(5.0);
        assertEquals(30005,manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
      manager.raiseSalary(manager.payBonus());
        assertEquals(30300, manager.getSalary(), 0.01);
    }


}
