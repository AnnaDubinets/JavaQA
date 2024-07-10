package HomeWork_05_07;


public class IntegerCalculator implements CalculatorInterface<Integer> {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Калькулятор для работы с числами с плавающей запятой
public class CalculatorInterfaceFloatCalculator implements CalculatorInterface<Double> {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double div(Double a, Double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Калькулятор для работы со строками (например, конкатенация)
public class StringCalculator implements CalculatorInterface<String> {

    @Override
    public String add(String a, String b) {
        return a + b;
    }

    @Override
    public String sub(String a, String b) {
        throw new UnsupportedOperationException("Subtraction is not supported for strings.");
    }

    @Override
    public String multi(String a, Integer b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b; i++) {
            result.append(a);
        }
        return result.toString();
    }

    @Override
    public String div(String a, String b) {
        throw new UnsupportedOperationException("Division is not supported for strings.");
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        CalculatorInterface<Integer> intCalc = new IntegerCalculator();
        System.out.println(intCalc.add(1, 2));  // 3
        System.out.println(intCalc.div(10, 2));  // 5

        CalculatorInterface<Double> floatCalc = new FloatCalculator();
        System.out.println(floatCalc.add(1.1, 2.2));  // 3.3
        System.out.println(floatCalc.div(10.0, 2.0));  // 5.0

        CalculatorInterface<String> strCalc = new StringCalculator();
        System.out.println(strCalc.add("Hello", " World"));  // "Hello World"
        System.out.println(strCalc.multi("Hello", 3));  // "HelloHelloHello"
    }
}
