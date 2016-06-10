package cl.curso.java.guia8;

/**
 * 
 * @author Simon Vera
 *
 */
public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	public final String[] nombreMeses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
			"septiembre", "octubre", "noviembre", "diciembre" };
	public final int[] cantidadDiasMes = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public Fecha() {
		this.dia = 23;
		this.mes = 5;
		this.anno = 1995;
	}

	public Fecha(int dia, int mes, int anno) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void imprimirFecha() {
		System.out.println(this.getDia() + "-" + this.getMes() + "-" + this.getAnno());
	}

	public void imprimirFechaFormato() {
		String nombreMes = nombreMeses[this.getMes() - 1];
		System.out.println(this.getDia() + " de " + nombreMes + " de " + this.getAnno());
	}

	public boolean esBisiesto() {
		return ((this.getAnno() % 4 == 0 || this.getAnno() % 400 == 0) && this.getAnno() % 100 != 0);
	}

	public void validarDia() throws DiaNoValidoException, MesNoValidoException {
		validarMes();
		if (this.getMes() == 2 && this.esBisiesto()) {
			if (!(this.getDia() >= 1 && this.getDia() <= 29)) {
				throw new DiaNoValidoException("si el año es bisiesto, no puede exceder de 29 dias");
			}
		} else {
			int cantDias = cantidadDiasMes[this.getMes() - 1];
			if (!(this.getDia() >= 1 && this.getDia() <= cantDias)) {
				throw new DiaNoValidoException("excede el numero maximo segun el mes" + this.getMes());
			}
		}
	}

	public void validarMes() throws MesNoValidoException {
		if (!(this.getMes() >= 1 && this.getMes() <= 12)) {
			throw new MesNoValidoException("excede el numero maximo de meses");
		}
	}

	public String toString() {
		return this.getDia() + "-" + this.getMes() + "-" + this.getAnno();
	}
}
