import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Peter", 321321, 10000);
    }

    @Test
    public void hasName(){
        assertEquals("Peter", databaseadmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(321321, databaseadmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000, databaseadmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        databaseadmin.raiseSalary(1000);
        assertEquals(11000, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        databaseadmin.payBonus();
        assertEquals(10100, databaseadmin.getSalary(), 0.01);
    }

}
