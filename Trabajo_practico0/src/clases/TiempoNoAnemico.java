package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {

	LocalDate fecha;

	public TiempoNoAnemico() {
		fecha = LocalDate.now();
	}

	public void FormatoCorto() {
		DateTimeFormatter fechaCompleta = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(fechaCompleta.format(fecha));
	}

	public void FormatoLargo() {
		DateTimeFormatter fechaCompleta = DateTimeFormatter.ofPattern("EEEE dd MMMM uuuu");
		System.out.println(fechaCompleta.format(fecha));
	}

}
