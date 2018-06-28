import Staff.Management.Director;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
        Director director;

        @Before
        public void before() {
            director = new Director("John", 1234566, 30000, "sales", 1000000);
        }

        @Test
        public void hasName(){
            assertEquals("John", director.getName());
        }

        @Test
        public void hasNiNumber(){
            assertEquals(1234566, director.getNiNumber());
        }

        @Test
        public void hasSalary(){
            assertEquals(30000, director.getSalary(), 0.01);
        }

        @Test
        public void hasDept(){
            assertEquals("sales", director.getDeptName());
        }

        @Test
        public void canRaiseSalary(){
            director.raiseSalary(1000);
            assertEquals(31000, director.getSalary(), 0.01);
        }

        @Test
        public void canGetBonus(){
            director.payBonus();
            assertEquals(30300, director.getSalary(), 0.01);
        }

        @Test
        public void canGetBudget(){
            assertEquals(1000000, director.getBudget(), 0.01);
        }

        @Test
        public void canSetName(){
            director.setName("Jack");
            assertEquals("Jack", director.getName());
        }

    }
