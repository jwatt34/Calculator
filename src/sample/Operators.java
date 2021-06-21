package sample;

public class Operators {
    private double answer;
    public double operation(double number1, double number2, String operator){
        switch(operator){
            case "+":
                answer = number1 + number2;
                return answer;
            case "-":
                answer = number1 - number2;
                return answer;
            case "*":
                answer = number1 * number2;
                return answer;
            case "/":
                answer = number1 / number2;
                return answer;
            case "^":
                answer = Math.pow(number1, number2);
                return answer;
        }
        return answer;
    }
}
