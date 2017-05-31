package io.projekat.predmet;

import java.util.List;

public class Profesor {
	
	private int id;
	private String ime;
	private String tip;
	private List<Smer> smerovi;
	
	
	public Profesor(int id,String ime,String tip,List<Smer> smerovi)
	{
		this.id = id;
		this.ime =ime;
		this.tip = tip;
		this.smerovi = smerovi;
		
		
	}
	public List<Smer> getSmerovi() {
		return smerovi;
	}
	public void setSmerovi(List<Smer> smerovi) {
		this.smerovi = smerovi;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	

}
