package pro.sky.java.cours2.calculatortest.service;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return " Добро пожаловать в калькулятор!";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1+num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {

        return num1-num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {

        return num1*num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        if(num2==0){
            throw new IllegalArgumentException("Деление на ноль запрещенно ");
        }

        return  num1/num2;
    }
}
