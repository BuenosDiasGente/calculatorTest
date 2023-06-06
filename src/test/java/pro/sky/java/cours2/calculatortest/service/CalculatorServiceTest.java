package pro.sky.java.cours2.calculatortest.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
     private final CalculatorService calculatorService=new CalculatorServiceImpl();

    @Test
   public void shouldCorrectlyCalculatorSum1() {
        int num1=5;
        int num2=4;
        int expectedSum=num1+num2;
        Integer actualSum=calculatorService.plus(num1,num2);
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void shouldCorrectlyCalculatorSum2() {
        int num1=-5;
        int num2=-4;
        int expectedSum=num1+num2;
        Integer actualSum=calculatorService.plus(num1,num2);
        assertEquals(expectedSum,actualSum);
    }

    @Test
    public void shouldCorrectlyCalculatorMinus1() {
        int num1=4;
        int num2=2;
        int expectedMinus=num1-num2;
        Integer actualMinus= calculatorService.minus(num1,num2);
        assertEquals(expectedMinus,actualMinus);
    }
    @Test
    public void shouldCorrectlyCalculatorMinus2() {
        int num1=-4;
        int num2=-2;
        int expectedMinus=num1-num2;
        Integer actualMinus= calculatorService.minus(num1,num2);
        assertEquals(expectedMinus,actualMinus);
    }


    @Test
    public void shouldCorrectlyCalculatorMultiply1() {
        int num1=5;
        int num2=2;
        int expectedMultiply=num1*num2;
        Integer actualMultiply= calculatorService.multiply(num1,num2);
        assertEquals(expectedMultiply,actualMultiply);
    }
    @Test
    public void shouldCorrectlyCalculatorMultiply2() {
        int num1=5;
        int num2=0;
        int expectedMultiply=num1*num2;
        Integer actualMultiply= calculatorService.multiply(num1,num2);
        assertEquals(expectedMultiply,actualMultiply);
    }

    @Test
    public void shouldCorrectlyCalculatorDivide() {
        double num1=5;
       double num2=2;
        Double expectedDivide=  num1/num2;
        Double actualDivide= calculatorService.divide(num1,num2);
        assertEquals(expectedDivide,actualDivide);
    }
    @Test
    public void shouldThrowExceptionWhenTheDivisorIsZero(){
        double num1=10;
        double num2=0;
        assertThrows(
                IllegalArgumentException.class,
                ()->calculatorService.divide(num1,num2)
        );

    }

}