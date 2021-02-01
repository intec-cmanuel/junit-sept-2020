package be.intecbrussel.calc;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public void initializeCalculator(){
        calculator = new Calculator();
    }

    @AfterAll
    public void testsDone(){
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void resetCalculator() {
        calculator.clear();
        System.out.println("Beginning Test");
    }

    @AfterEach
    public void testClear(){
        System.out.println("Test finished");
    }

    @Test
    public void testSumOfManyNumbers(){
        calculator.addNumbers(5,8,6,1,96,84,156,15,56);
        calculator.addition();
        double result = calculator.getResult();

        Assertions.assertEquals(427, result);
    }

    @Test
    public void testSubtractionWithTwoNumbers() throws TooManyNumbersException, NotEnoughNumbersException {
        calculator.addNumbers(10,7);
        calculator.subtraction();
        double result = calculator.getResult();

        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSubtractionWithMoreThanTwoNumbers() {
        calculator.addNumbers(10,7,3);

        Assertions.assertThrows(TooManyNumbersException.class, () -> calculator.subtraction());
    }

    @Test
    public void testSubtractionWithOneNumber() {
        calculator.addNumbers(10);

        Assertions.assertThrows(NotEnoughNumbersException.class, () -> calculator.subtraction());
    }

    @Test
    public void testMultiplicationWithoutZero() {
        calculator.addNumbers(10,7,80);
        calculator.multiplication();
        double result = calculator.getResult();

        Assertions.assertEquals(5600, result);
    }

    @Test
    public void testDivisionWithTwoNumbers() throws NotEnoughNumbersException, TooManyNumbersException {
        calculator.addNumbers(10,2);
        calculator.division();
        double result = calculator.getResult();

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivisionWithMoreThanTwoNumbers() {
        calculator.addNumbers(10,7,3);

        Assertions.assertThrows(TooManyNumbersException.class, () -> calculator.division());
    }

    @Test
    public void testDivisionWithZero() {
        calculator.addNumbers(10,0);

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.division());
    }

    @Test
    public void testDivisionWithOneNumber() {
        calculator.addNumbers(10);

        Assertions.assertThrows(NotEnoughNumbersException.class, () -> calculator.division());
    }

    @Test
    public void testPower() {
        calculator.addNumbers(10,2,3,4);
        calculator.power();
        double result = calculator.getResult();

        Assertions.assertEquals(1_000_000_000_000_000_000_000_000D, result);
    }

    @Test
    public void testSquareRootPositiveOneNumberPositiveResult(){
        calculator.addNumbers(25);
        calculator.squareRoot();
        double result = calculator.getResult();

        Assertions.assertEquals(5, result);
    }

    @Test
    public void clearTest() {
        calculator.addNumbers(5,5,5,5,5,5,5,54);
        calculator.multiplication();
        calculator.clear();

        Assertions.assertTrue(calculator.getNumbers().size() == 0);
        Assertions.assertTrue(calculator.getResult() == 0);
    }

}
