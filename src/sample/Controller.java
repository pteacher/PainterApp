package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML private RadioButton blackRadioButton;
    @FXML private RadioButton redRadioButton;
    @FXML private RadioButton greenRadioButton;
    @FXML private RadioButton blueRadioButton;
    @FXML private RadioButton smallRadioButton;
    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private Pane drawingAreaPane;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private Button undoButton;
    @FXML private ToggleGroup sizeToggleGroup;

    private int radius = 2;
    private Paint brushColor = Color.RED;

    public void initialize() {
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        greenRadioButton.setUserData(Color.GREEN);
        blueRadioButton.setUserData(Color.BLUE);

        smallRadioButton.setUserData(2);
        mediumRadioButton.setUserData(4);
        largeRadioButton.setUserData(6);
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent e) {
        Circle circle = new Circle(e.getX(), e.getY(), radius, brushColor);
        drawingAreaPane.getChildren().add(circle);
    }

    @FXML
    private void colorRadioButtonSelected(ActionEvent e) {
        brushColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent e) {
        radius = (int) sizeToggleGroup.getSelectedToggle().getUserData();
    }


}
