import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getFNameTest(){
        Person person = new Person();
        person.setfName("Vanilla Ice");
        String expected = "Vanilla Ice";
        String actual = person.getfName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setFNameTest(){
        Person person = new Person("John", "Doe");
        person.setfName("Jane");
        String expected = "Jane";
        String actual = person.getfName();
        Assert.assertEquals(expected,actual);
    }
}
