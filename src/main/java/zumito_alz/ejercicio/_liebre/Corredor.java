package zumito_alz.ejercicio._liebre;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public abstract class Corredor extends Thread {
    protected ProgressBar barra;
    protected Label etiqueta;
    protected String nombre;
    protected int pausa;          

    protected void avanzar(final double progreso) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                barra.setProgress(progreso);
            }
        });
    }

    protected void mensaje(final String texto) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                etiqueta.setText(nombre + ": " + texto);
            }
        });
    }

    protected abstract void correr() throws InterruptedException;

    @Override
    public void run() {
        try {
            correr();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
