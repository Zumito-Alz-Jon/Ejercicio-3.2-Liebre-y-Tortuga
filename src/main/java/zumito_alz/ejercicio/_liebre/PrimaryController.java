package zumito_alz.ejercicio._liebre;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnIniciar;
    @FXML private Label lblLiebre, lblTortuga;
    @FXML private ProgressBar pbLiebre, pbTortuga;

    @FXML
    private void btnIniciar_click() {
        btnIniciar.setDisable(true);   
        pbLiebre.setProgress(0);
        pbTortuga.setProgress(0);

        new Liebre(pbLiebre, lblLiebre).start();
        new Tortuga(pbTortuga, lblTortuga).start();
    }
}
