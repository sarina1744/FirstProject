import Day6.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @Test
    @DisplayName("Testing sum with two whole numbers")
    @Order(2)
    public void testCalculatorSum1(){
        Calculator calc = new Calculator();
                 //expected
                //acutal
              int actual =   calc.sum(10,10);
              int expected = 20;
              assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and zero")
    @Order(3)
    public void testCalculatorSum2(){
        Calculator calc = new Calculator();
        //expected
        //acutal
        int actual =   calc.sum(20,0);
        int expected = 20;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and negative number")
    @Order(1)
    public void testCalculatorSum3(){
        Calculator calc = new Calculator();
        //expected
        //acutal
        int actual =   calc.sum(30,-10);
        int expected = 20;
        assertEquals(expected,actual);
    }
}