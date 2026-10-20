package zumito_alz.ejercicio._liebre;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Tortuga extends Corredor {

    public Tortuga(ProgressBar barra, Label etiqueta) {
        this.nombre = "La Tortuga";
        this.barra = barra;
        this.etiqueta = etiqueta;
        this.pausa = 100;
        setDaemon(true);
    }

    @Override
    protected void correr() throws InterruptedException {
        mensaje("¡Está corriendo!");
        for (int i = 1; i <= 100; i++) {
            Thread.sleep(pausa);
            avanzar(i / 100.0);
        }
        mensaje("¡Llegó a la meta!");
    }
}
