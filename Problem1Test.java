import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Problem1Test {
    @Test
    public void check_even()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is even",p.check_even_odd(2));
    }
  @Test
    public void check_odd()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is odd",p.check_even_odd(3));
    }
    @Test
    public void check2()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is even",p.check_even_odd(0));
    }
    @Test
    public void check3()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is even",p.check_even_odd(-5));
    }
    @Test
    public void check4()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is even",p.check_even_odd(1000));
    } public void check4()
    {
        Problem1 p=new Problem1();
        assertEquals("the number is even",p.check_even_odd(0.5));
    }

}