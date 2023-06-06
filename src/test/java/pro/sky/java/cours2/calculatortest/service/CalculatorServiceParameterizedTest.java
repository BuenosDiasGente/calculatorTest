package pro.sky.java.cours2.calculatortest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService=new CalculatorServiceImpl();
    private  static Stream<Arguments>argumentProviderForSum(){
        return Stream.of(
                Arguments.of(5,5,10),
                Arguments.of(-5,-5,-10),
                Arguments.of(5,-5,0),
                Arguments.of(0,0,0),
                Arguments.of(0,1,1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProviderForSum")
    public void shouldCorrectlyCalculatorSum(int num1,int num2,int expectedSum) {
        Integer actualSum=calculatorService.plus(num1,num2);
        assertEquals(expectedSum,actualSum);
    }
    private  static Stream<Arguments>argumentProviderForMinusAndMultiply(){
        return Stream.of(
                Arguments.of(6,2),
                Arguments.of(-6,-2),
                Arguments.of(-6,2),
                Arguments.of(6,0),
                Arguments.of(0,6)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForMinusAndMultiply")
    public void shouldCorrectlyCalculatorMinus(int num1,int num2) {
        int expectedMinus=num1-num2;
        Integer actualMinus= calculatorService.minus(num1,num2);
        assertEquals(expectedMinus,actualMinus);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForMinusAndMultiply")
    public void shouldCorrectlyCalculatorMultiply2(int num1,int num2) {
        int expectedMultiply=num1*num2;
        Integer actualMultiply= calculatorService.multiply(num1,num2);
        assertEquals(expectedMultiply,actualMultiply);
    }
    private  static Stream<Arguments>argumentProviderForDivide(){
        return Stream.of(
                Arguments.of(6,2),
                Arguments.of(-6,-2),
                Arguments.of(-6,2),
                Arguments.of(0,6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProviderForDivide")
    public void shouldCorrectlyCalculatorDivide(double num1,double num2) {
        Double expectedDivide=  num1/num2;
        Double actualDivide= calculatorService.divide(num1,num2);
        assertEquals(expectedDivide,actualDivide);
    }


}