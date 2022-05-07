import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class problem2Test {
    int arr[]={3,6,7,8,10,100};
    @Test
    public void check_greatest()
    {
        problem2 p2=new problem2();
        assertEquals(100,p2.getMax(arr));

    }
    @Test
    public void check_greatest2()
    {
        problem2 p2=new problem2();
        assertEquals(8,p2.getMax(arr));

    }
    @Test
    public void check_Min()
    {
        problem2 p2=new problem2();
        assertEquals(3,p2.getMin(arr));
    }
    @Test
    public void check_Min2()
    {
        problem2 p2=new problem2();
        assertEquals(10,p2.getMin(arr));
    }
}