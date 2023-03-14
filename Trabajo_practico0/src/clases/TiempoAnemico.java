package clases;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class TiempoAnemico {

	public LocalDate fecha;

	public TiempoAnemico() {
		fecha = LocalDate.now();
	}

	// --- Metodos para la Anemia ---

	public int getDia() {

		return fecha.getDayOfMonth();

	}

	public DayOfWeek getDiaSemanal() {
		return fecha.getDayOfWeek();
//		DateFormat dia = new SimpleDateFormat("EEEE");
//		return dia.format(fecha);

	}

	public int getMes() {
		return fecha.getMonthValue();

	}

	public Month getMesDelAño() {
		return fecha.getMonth();
//		DateFormat mes = new SimpleDateFormat("MMMM");
//		return mes.format(fecha);
	}

	public int getAño() {
		return fecha.getYear();
	}

	public void setTiempo(LocalDate fecha) {
		this.fecha = fecha;
	}
}
