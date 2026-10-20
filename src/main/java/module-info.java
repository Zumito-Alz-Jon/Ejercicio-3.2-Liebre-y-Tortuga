module zumito_alz.ejercicio._liebre {
    requires javafx.controls;
    requires javafx.fxml;

    opens zumito_alz.ejercicio._liebre to javafx.fxml;
    exports zumito_alz.ejercicio._liebre;
}
