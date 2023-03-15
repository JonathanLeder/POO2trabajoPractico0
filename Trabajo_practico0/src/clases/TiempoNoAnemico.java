package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {

	LocalDate fecha;

	public TiempoNoAnemico() {
		fecha = LocalDate.now();
	}

	public String FormatoCorto() {
		DateTimeFormatter fechaCompleta = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return fechaCompleta.format(fecha);
	}

	public String FormatoLargo() {
		DateTimeFormatter fechaCompleta = DateTimeFormatter.ofPattern("EEEE dd MMMM uuuu");
		return fechaCompleta.format(fecha);// retornar la fecha en forma de string y cambiar los syso
	}

}
