import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem3Test {
    @Test
    public void check_state() {
        problem3 p3 = new problem3();
        assertEquals("Update", p3.getState("c"));
    }
    @Test
    public void check_state1() {
        problem3 p3 = new problem3();
        assertEquals("Alarm", p3.getState("b"));
    }
    @Test
    public void check_state2() {
        problem3 p3 = new problem3();
        assertEquals("Normal", p3.getState("a"));
    }
    @Test
    public void check_state3() {
        problem3 p3 = new problem3();
        assertEquals("Normal", p3.getState("aa"));
    }
    @Test
    public void check_state4() {
        problem3 p3 = new problem3();
        assertEquals("Normal", p3.getState("caab"));
    }
    @Test
    public void check_state5() {
        problem3 p3 = new problem3();
        assertEquals("Normal", p3.getState("x"));
    }
    }