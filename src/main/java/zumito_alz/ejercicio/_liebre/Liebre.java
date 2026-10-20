package zumito_alz.ejercicio._liebre;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Liebre extends Corredor {

    public Liebre(ProgressBar barra, Label etiqueta) {
        this.nombre = "La Liebre";
        this.barra = barra;
        this.etiqueta = etiqueta;
        this.pausa = 30;
        setDaemon(true);
    }

    @Override
    protected void correr() throws InterruptedException {
        mensaje("¡Está corriendo!");
        for (int i = 1; i <= 100; i++) {
            Thread.sleep(pausa);
            avanzar(i / 100.0);

            if (i == 50) {                     
                mensaje("¡Se durmió!");
                Thread.sleep(7200);
                mensaje("¡Está corriendo!");
            }
        }
        mensaje("Terminó la carrera");
    }
}
