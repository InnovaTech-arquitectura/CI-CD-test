import org.example.Calculator;

public class CalculatorTest {
    public void testAdd() {
        Calculator calculator = new Calculator();
        assert calculator.add(1, 1) == 2;
    }
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assert calculator.subtract(23, 52) == -29;
    }
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assert calculator.multiply(34, 2) == 68;
    }
    public void testDivide() {
        Calculator calculator = new Calculator();
        assert calculator.divide(12, 3) == 4;
    }
    public void testModulo() {
        Calculator calculator = new Calculator();
        assert calculator.modulo(12, 5) == 2;
    }
    public void testPower() {
        Calculator calculator = new Calculator();
        assert calculator.power(2, 3) == 8;
    }
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testAdd();
        test.testSubtract();
        test.testMultiply();
        test.testDivide();
        test.testModulo();
    }
}
