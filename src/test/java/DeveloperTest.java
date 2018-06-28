import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Zsolt", 98765, 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(98765, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(36000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        developer.payBonus();
        assertEquals(35350, developer.getSalary(), 0.01);
    }
            
}
