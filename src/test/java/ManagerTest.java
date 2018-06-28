import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", 1234566, 30000, "sales");
    }

    @Test
    public void hasName(){

    }
}
