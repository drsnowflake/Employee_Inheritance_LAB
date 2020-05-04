import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("AJ", "J2345673WXW", 50000, "Director", 1);
    }

    @Test
    public void hasName() {
        assertEquals("AJ", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("J2345673WXW", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Director", director.getDepartmentName());
    }

    @Test
    public void CanRaiseSalary() {
        director.raiseSalary(5.0);
        assertEquals(50005, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        director.raiseSalary(director.payBonus());
        assertEquals(50500, director.getSalary(), 0.01);
    }

}