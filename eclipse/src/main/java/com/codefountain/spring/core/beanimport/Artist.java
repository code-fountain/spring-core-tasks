package com.codefountain.spring.core.beanimport;

public class Artist {
	
	private String name;
	private Insrument instrument;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Insrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Insrument instrument) {
		this.instrument = instrument;
	}
	
	@Override
	public String toString() {
		return "Artist [name=" + name + ", instrument=" + instrument + "]";
	}
}
