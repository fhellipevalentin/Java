package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme implements Comparable<Filme>{
	private String titulo;
	private Date datadeLancamento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Filme(String titulo, Date datadeLancamento) {
		this.titulo = titulo;
		this.datadeLancamento = datadeLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDatadeLancamento() {
		return datadeLancamento;
	}

	public void setDatadeLancamento(Date datadeLancamento) {
		this.datadeLancamento = datadeLancamento;
	}

	@Override
	public String toString() {
		return "Filme " + titulo + ", data de lancamento: " + sdf.format(datadeLancamento);
	}

	@Override
	public int compareTo(Filme outrofilme) {
		return this.titulo.compareTo(outrofilme.titulo);
	}
	
	
	
}
