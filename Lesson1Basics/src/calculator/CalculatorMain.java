package calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add " + calc.add(5, 8));
        System.out.println("Substract " + calc.substract(5, 8));
        System.out.println("Divide " + calc.divide(50, 8));
        System.out.println("Multiply " + calc.multiply(5, 8));

        System.out.println(calc.hashCode());
    }
}
