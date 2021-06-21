package sample;

public class Controller {
    Operators operators = new Operators();
    private double num1;
    private double num2;
    private String op;
    private double result;

    public void math(){
        result = operators.operation(getNum1(), getNum2(), getOp());
        setResult(result);

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
