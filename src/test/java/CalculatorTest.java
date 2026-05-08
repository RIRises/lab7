import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-5, 5));
        assertEquals(-10, calc.add(-7, -3));
        assertEquals(42, calc.add(42, 0));
        assertEquals(42, calc.add(0, 42));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.dif(10, 5));
        assertEquals(0, calc.dif(7, 7));
        assertEquals(-2, calc.dif(-5, -3));
        assertEquals(2, calc.dif(-3, -5));
        assertEquals(7, calc.dif(7, 0));
        assertEquals(-7, calc.dif(0, 7));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.div(20, 5));
        assertEquals(3, calc.div(10, 3));
        assertEquals(-4, calc.div(20, -5));
        assertEquals(4, calc.div(-20, -5));
        assertEquals(0, calc.div(0, 5));
        assertThrows(ArithmeticException.class, () -> calc.div(10, 0));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.times(3, 4));
        assertEquals(0, calc.times(100, 0));
        assertEquals(0, calc.times(0, 100));
        assertEquals(-20, calc.times(4, -5));
        assertEquals(20, calc.times(-4, -5));
        assertEquals(42, calc.times(42, 1));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();

        List<Integer> roots1 = calc.solver(1, -5, 6);
        assertEquals(2, roots1.size());
        assertTrue(roots1.contains(2));
        assertTrue(roots1.contains(3));

        List<Integer> roots2 = calc.solver(1, -4, 4);
        assertEquals(1, roots2.size());
        assertEquals(2, roots2.get(0));

        List<Integer> roots3 = calc.solver(1, 1, 1);
        assertEquals(1, roots3.size());
        assertEquals(-1, roots3.get(0));

        List<Integer> roots4 = calc.solver(1, -3, 2);
        assertEquals(2, roots4.size());
        assertTrue(roots4.contains(1));
        assertTrue(roots4.contains(2));

        List<Integer> roots5 = calc.solver(2, -3, 1);
        assertEquals(2, roots5.size());
    }
}