package dev.normanpendzich.taschenrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    public Text resultLabel;

    boolean isTypingNumber = false;
    double firstNum = 0;
    double secondNum = 0;
    String operation = "";

    Model model = new Model();

    public void numTapped(ActionEvent event) {

        String value = ((Button)event.getSource()).getText();

        if (isTypingNumber) {
            resultLabel.setText(resultLabel.getText() + value);
        } else {
            resultLabel.setText(value);
            isTypingNumber = true;
        }
    }

    public void calculatorTabbed(ActionEvent event) {
        isTypingNumber = false;
        firstNum = Double.parseDouble(resultLabel.getText());
        operation = ((Button)event.getSource()).getText();

    }

    public void equalsTabbed(ActionEvent event) {
        isTypingNumber = false;
        secondNum = Double.parseDouble(resultLabel.getText());

        double result = model.calculate(firstNum,secondNum,operation);

        resultLabel.setText(String.valueOf(result));
    }

    public void restartTabbed(ActionEvent event) {
    resultLabel.setText("");
    firstNum = 0;
    secondNum = 0;
    }
}
