package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import model.Counter;

import java.awt.*;

public class Controller {
    private Counter counter=new Counter();

    private String buttonLabel="Foo";
    public void counterAction(ActionEvent actionEvent) {
        Button button=(Button) actionEvent.getSource();
        counter.increment();
        buttonLabel="Pressed:" + counter.getValue();
        button.setText(buttonLabel);
    }
}
