package PowtorzenieWiad25082017.Zad3_Dziedziczenie;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends PersonTest {
    @Test
    public void defaultStudentGetandSetProgramAndYearAndFeeTest() {
        Student student = new Student("Student", "Akademik",
                "Polonistyka", 2017, 200.00);
        student.setProgram("Informatyka");
        student.setYear(2005);
        student.setFee(300.00);
        Assert.assertEquals("Student", student.getName());
        Assert.assertEquals("Akademik", student.getAddress());
        Assert.assertEquals("Informatyka", student.getProgram());
        Assert.assertEquals(2005, student.getYear());
        Assert.assertEquals(300.00, student.getFee(), 0.01);
    }
}
