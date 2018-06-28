import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", 1234566, 30000, "sales");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(1234566, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("sales", manager.getDeptName());
    }


}
