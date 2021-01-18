package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Film {
	
	
	private Date releaseDate;
	private String name;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Film(Date releaseDate, String name) {
		this.releaseDate = releaseDate;
		this.name = name;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Filme " + name + ", release Date: " + sdf.format(releaseDate) + "]";
	}
	
	
	
}
