import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;
    private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm");
    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = LocalDate.parse(fecha, formatoFecha);
        this.hora = LocalTime.parse(hora);
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha.format(formatoFecha);
    }

    public String getHora() {
         return hora.format(formatoHora); 
     }
}