package model;

import javax.persistence.Embeddable;
//klasa visitcard je value object-klasa koja ima propertije i sama je property klase user
//Em- rekli smo mu da je value object, ali da nije entitet. sada ce ga baza  prepoznati
@Embeddable
public class VisitCard {

	private String ime;
	private String brojTelefona;
	private String email;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
