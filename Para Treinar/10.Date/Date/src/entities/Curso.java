package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Curso {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private Date dataDeLancamento;
	
	public Curso(String name, Date dataDeLancamento) {
		
		this.name = name;
		this.dataDeLancamento = dataDeLancamento;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	@Override
	public String toString() {
		return "Curso: " + name + ", data de lancamento = " + sdf.format(this.dataDeLancamento) + " ]";
	}
	
	
	
}
