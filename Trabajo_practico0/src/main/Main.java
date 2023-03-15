package main;

import java.time.LocalDate;

import clases.TiempoAnemico;
import clases.TiempoNoAnemico;
import clases.TiempoRecord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TiempoNoAnemico fecha = new TiempoNoAnemico();

		System.out.println("\t----Forma no Anemica----");
		System.out.println(fecha.FormatoCorto());// Sacar los syso
		fecha.FormatoLargo();

		System.out.println("\t----Forma Anemica----");

		TiempoAnemico fechaAnemica = new TiempoAnemico();

		System.out.println(fechaAnemica.getDia() + "/" + fechaAnemica.getMes() + "/" + fechaAnemica.getAño());

		System.out.println(fechaAnemica.getDiaSemanal() + "," + fechaAnemica.getDia() + " de "
				+ fechaAnemica.getMesDelAño() + " de " + fechaAnemica.getAño());

		System.out.println("\n\t----Implementacion con Record----");

		LocalDate hoy = LocalDate.now();
		TiempoRecord tiempoRecord = new TiempoRecord(hoy);

		System.out.println(tiempoRecord.fecha());

	}

}
