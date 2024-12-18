package Classes;

import java.util.ArrayList;
import java.time.LocalDate;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.File;
import javax.swing.JOptionPane;

/**
 * Clase principal que se encarga de gestionar y ejecutar las copias de seguridad programadas.
 * Consulta la base de datos para obtener todas las programaciones de copia de seguridad y realiza las copias
 * según el intervalo especificado.
 *
 * @author Luis Carlos Caicedo Giraldo
 */
public class Main {

    /** Objeto de acceso a datos para manejar operaciones de base de datos relacionadas con las copias de seguridad */
    private static final DAO DATABASE = new DAO();

    /** Fecha actual, utilizada para verificar si se debe realizar una copia de seguridad */
    private static final LocalDate CURRENT_DATE = LocalDate.now();

    /**
     * Método principal que inicia la aplicación y ejecuta las copias de seguridad programadas.
     * Obtiene la lista de programaciones desde la base de datos y verifica si la fecha de la próxima
     * copia de seguridad coincide con la fecha actual. Si es así, copia los archivos de la ruta de
     * origen a la ruta de destino.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        copyFile();
    }
    
    private static void copyFile() {
        ArrayList<Backup> schedules = DATABASE.getBackups();
        try {
            // Itera sobre cada programación para verificar si corresponde realizar una copia hoy
            for (Backup schedule: schedules) {  
                // Verifica si la fecha actual coincide con la próxima fecha de copia  /*
                if (schedule.getLastBackup().plusDays(schedule.getDayInterval()).equals(CURRENT_DATE)) {
                    // Realiza la copia de la ruta de origen a la ruta de destino
                    File copy = new File(schedule.getDestination().toPath() + "\\" + schedule.getSource().getName());
                    Files.copy(schedule.getSource().toPath(), copy.toPath() , StandardCopyOption.REPLACE_EXISTING);
                    schedule.setLastBackup(CURRENT_DATE);
                    DATABASE.editBackup(schedule);
                    
                }
            }
        } catch (IOException  e) {
            JOptionPane.showMessageDialog(null,
                    "No se ha podido realizar una copia de seguridad\nRevisa tus programaciones en Securalia", "Securalia | ¡Atención!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
