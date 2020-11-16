public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(30);
        c.setOperation('-');
        c.setOperandTwo(17);
        c.performOperation();
        c.getResults();
    }
}
