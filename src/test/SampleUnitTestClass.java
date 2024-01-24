package test;

import main.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class SampleUnitTestClass {

    @Test
    public void test(){
        System.out.println(" inside test ");
    }

    Calculator calculatorTest = new Calculator();

    @BeforeAll
    static void beforeAll(){
        System.out.println(" inside before all ");
    }

    @BeforeEach
    void setup(){
        System.out.println(" inside before each ");
        this.calculatorTest = new Calculator();
    }

    @AfterEach
    void afterEach(){
        System.out.println(" inside after each ");
    }

    @AfterAll
    static void afterAll(){
        System.out.println(" inside after all ");
    }

    //Testlerin başarılı olması için expected ve actual değerlerinin eşit olması gerekiyor.
//    RepeatedTest anotasyonu ile testin kaç kere tekrarlanacağı belirleniyor.
//    DisplayName anotasyonu ile testin adı belirleniyor.
    @Test
    @RepeatedTest(2)
    @DisplayName(value = "This test should return equals when add two number")
    public void test_add(){
        // given
        int firstNumber = 10;
        int secondNumber = 20;
        int expected = 30;

        // when
        int actual = calculatorTest.add(firstNumber, secondNumber);

        // then
        Assertions.assertEquals(expected, actual);
    }

    //Testlerin başarılı olması için expected ve actual değerlerinin eşit olması gerekiyor.
    @Test
    public void should_returnNotEquals_when_addTwoNumber(){
        // given
        int firstNumber = 10;
        int secondNumber = 20;
        int expected = 40;

        // when
        int actual = calculatorTest.add(firstNumber, secondNumber);

        // then
        Assertions.assertNotEquals(expected, actual);
    }

    //Tek bir parametre girmek için ValueSource() anotasyonu kullanılıyor.
    @ParameterizedTest
    @ValueSource(ints = {-10, 1, 0, 20})
    public void should_returnZero_when_multiplyNumberWithZero(int givenSource){
        // given
        int firstNumber = givenSource;
        int secondNumber = 0;

        // when
        int actual = calculatorTest.multiply(firstNumber, secondNumber);

        // then
        Assertions.assertTrue(actual == 0);
    }

    //Birden fazla parametre girmek için CsvSource() anotasyonu kullanılıyor.
    @ParameterizedTest(name = "1st={0}, 2nd={1}")
    @CsvSource(value = {"-10, -1", "-10, -20", "-3, -45"})
    public void should_returnTrue_when_multiplyTwoNegativeNumbers(int givenFirstNumber, int givenSecondNumber){
        // given
        int firstNumber = givenFirstNumber;
        int secondNumber = givenSecondNumber;

        // when
        int actual = calculatorTest.multiply(firstNumber, secondNumber);

        // then
        Assertions.assertTrue(actual > 0);
    }

    //Hata fırlatması beklenen testlerde assertThrows() metodu kullanılıyor.
    @Test
    public void should_throwException_when_divideNumberWithZero(){
        // given
        int firstNumber = 10;
        int secondNumber = 0;

        // when
        Executable executable = () -> calculatorTest.divide(firstNumber, secondNumber);
//        Executable executable = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                calculatorTest.divide(firstNumber, secondNumber);
//            }
//        };

        // then
        Assertions.assertThrows(ArithmeticException.class, executable);
    }
}