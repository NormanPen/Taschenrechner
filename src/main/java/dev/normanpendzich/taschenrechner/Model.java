package dev.normanpendzich.taschenrechner;

public class Model {


    public double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Man kann nicht durch 0 teilen");
                }
                return num1 / num2;
        }
        return 0;
    }

}
