package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//entity-za tabelu
//table-podesavanje kada ne zelimo da se tabela zove isto kao i klasa
@Entity
@Table(name = "korisnik")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//samo za single table strategy
/*@DiscriminatorColumn(name = "Vrsta_usera", discriminatorType = DiscriminatorType.STRING)*/
public class User {
	
	
	//id-za kolonu id da dodaje sama
	//gv-da bi kolona id bila autoincrement
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idUser;
	//column-isto kao i za table
	@Column(name = "user_name")
	private String userName;
	private String password;
	private double novcanik;
	
	
	@ElementCollection
	private List<VisitCard> visitCards = new ArrayList<VisitCard>();

	@OneToMany(fetch = FetchType.EAGER , mappedBy = "korisnik")
	private List<Car> automobili = new ArrayList<Car>();
	
	
	
	public List<Car> getAutomobili() {
		return automobili;
	}
	public void setAutomobili(List<Car> automobili) {
		this.automobili = automobili;
	}
	public List<VisitCard> getVisitCards() {
		return visitCards;
	}
		public void setVisitCards(List<VisitCard> visitCards) {
			this.visitCards = visitCards;
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
