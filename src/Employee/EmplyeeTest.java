package Employee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmplyeeTest {
    @Test
    public void IDandFirstNameAndLastNameAndSalarySetAndGetTest() {
        Emplyee emplyee = new Emplyee(21, "Jan", "Kowalski", 2300);
        emplyee.setSalary(6000);
        assertEquals(21, emplyee.getID());
        assertEquals("Jan", emplyee.getFirstName());
        assertEquals("Kowalski", emplyee.getLastName());
        assertEquals(6000, emplyee.getSalary());
    }

    @Test
    public void getName() {
        Emplyee emplyee = new Emplyee(21, "Jan", "Kowalski", 2300);
        assertEquals("Jan Kowalski", emplyee.getName());
    }

    @Test
    public void getAnnualSalary() {
        Emplyee emplyee = new Emplyee(21, "Jan", "Kowalski", 2300);
        assertEquals(27600, emplyee.getAnnualSalary());
    }

    @Test
    public void raiseSalary() {
        Emplyee emplyee = new Emplyee(21, "Jan", "Kowalski", 2300);
        assertEquals(2415, emplyee.raiseSalary(5));
    }

    @Test
    public void toStringtest() {
        Emplyee emplyee = new Emplyee(21, "Jan", "Kowalski", 2300);
        assertEquals("Employee[id=21, name=Jan Kowalski, salary=2300]", emplyee.toString());
    }


}
