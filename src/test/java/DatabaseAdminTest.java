import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup() {
        databaseAdmin = new DatabaseAdmin("Paul Smith", "JW234FXV", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Paul Smith", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JW234FXV", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void CanRaiseSalary() {
        databaseAdmin.raiseSalary(5.0);
        assertEquals(20005.0,databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.raiseSalary(databaseAdmin.payBonus());
        assertEquals(20200.0, databaseAdmin.getSalary(), 0.01);
    }


}