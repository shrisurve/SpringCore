package com.springcore.withoutxml.configuration;

public class Foods 
{
	

	private Samosa samosa;
	

	public Foods(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void makeDish()
	{
		this.samosa.getSamosa();
		
		System.out.println("Making a samosa");
	}

	@Override
	public String toString() {
		return "Foods [samosa=" + samosa + "]";
	}
	
}
