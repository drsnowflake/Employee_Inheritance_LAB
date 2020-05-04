import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("Paul Smith", "JW234FXV", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Paul Smith", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JW234FXV", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, developer.getSalary(),0.01);
    }

    @Test
    public void CanRaiseSalary() {
        developer.raiseSalary(5.0);
        assertEquals(20005.0,developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        developer.raiseSalary(developer.payBonus());
        assertEquals(20200.0, developer.getSalary(), 0.01);
    }


}