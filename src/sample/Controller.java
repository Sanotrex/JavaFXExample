package sample;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {
    public TextField nameText;
    public Label helloMsg;
    public Slider slider;


    public void initialize() {
        helloMsg.textProperty().bind(
                Bindings.concat("Hello, ", nameText.textProperty())
        );
        helloMsg.scaleYProperty().bind(slider.valueProperty());

    }
}
