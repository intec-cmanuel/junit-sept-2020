package be.intecbrussel.dynamic;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

//public class FactorialTest {
//
//    Factorial factorial = new Factorial();
//
//    @TestFactory
//    Collection<DynamicTest> dynamicTestsFromCollection() {
//        return Arrays.asList(
//                dynamicTest("Test -1", () -> Assertions.assertThrows(NotFactorisableNumberException.class, () -> factorial.getFactorial(-1))),
//                dynamicTest("Test 0", () -> Assertions.assertEquals(1, factorial.getFactorial(0))),
//                dynamicTest("Test 3", () -> Assertions.assertEquals(6, factorial.getFactorial(3)))
//        );
//    }
//}

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//class FactorialTest {
//
//    private Factorial factorial;
//
//    @BeforeAll
//    public void initialize() {
//        factorial = new Factorial();
//    }
//
//    @TestFactory
//    Stream<DynamicTest> testCalculateFactorial() {
//
//        return Stream.of(dynamicTest("Passing a number as an argument", () -> assertNotNull(factorial.calculateFactorial(12))),
//                dynamicTest("Passing 0 as an argument, result is not Null", () -> assertEquals(1, factorial.calculateFactorial(0))),
//                dynamicTest("Passing a positive number as an argument", () -> assertEquals(24, factorial.calculateFactorial(4))),
//                dynamicTest("Passing a negative number as an argument",
//                        () -> assertThrows(IllegalArgumentException.class, () -> factorial.calculateFactorial(-5))));
//    }
//}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FactorialTest {

    private Factorial fact;

    @BeforeAll
    public void initializeFactorial(){
        fact = new Factorial();
    }

    @TestFactory
    Collection<DynamicTest> testGetFactorial_WithDynamicTests() {
        return Arrays.asList(
                dynamicTest("Test with integer, result is not Null", ()->assertNotNull(fact.getFactorial2(12))),
                dynamicTest("Test with negative integer, throws NegativeNumberInputException",
                        ()->assertThrows(NegativeNumberInputException.class,()->fact.getFactorial2(-12))),
                dynamicTest("Test with zero", ()->assertEquals(1, fact.getFactorial2(0))),
                dynamicTest("Test with positive integer", ()->assertEquals(120, fact.getFactorial2(5))),
                dynamicTest("Test with positive integer", ()->assertEquals(24, fact.getFactorial2(4)))
        );
    }
}