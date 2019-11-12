package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//entity-za tabelu
//table-podesavanje kada ne zelimo da se tabela zove isto kao i klasa
@Entity
@Table(name = "korisnik")
public class User {
	
	
	//id-za kolonu id da dodaje sama
	//gv-da bi kolona id bila autoincrement
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	//column-isto kao i za table
	@Column(name = "user_name")
	private String userName;
	private String password;
	private double novcanik;
	
	
	@Embedded
	private VisitCard visitCard;
	
	
	
	public VisitCard getVisitCard() {
		return visitCard;
	}
	public void setVisitCard(VisitCard visitCard) {
		this.visitCard = visitCard;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getNovcanik() {
		return novcanik;
	}
	public void setNovcanik(double novcanik) {
		this.novcanik = novcanik;
	}

}
