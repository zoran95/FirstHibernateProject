package automobili;



import java.util.ArrayList;
import java.util.List;

import controller.HibernetDAO;
import model.Car;
import model.Kupac;
import model.Prodavac;
import model.User;
import model.VisitCard;
import model.VrstaVozila;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
		HibernetDAO dao = new HibernetDAO();
		
		
		User user =new User();
		
		user.setUserName("Pera");
		
		
		Prodavac prodavac = new Prodavac();
		prodavac.setUserName("Elvis");
		prodavac.setPib(1);

		
		Kupac kupac = new Kupac();
		kupac.setUserName("Milica");
		kupac.setJmbg("1234567890123");
		
		dao.snimiUseraUBazu(user);
		dao.snimiUseraUBazu(prodavac);
		dao.snimiUseraUBazu(kupac);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	User user = dao.vratiUsera(1);
		System.out.println("Zdravo "+ user.getUserName());*/
		
		
		//dao.izlistajAutomobile(user);
		
		/*
		  Car auto1 = dao.vratiAuto(1); 
		  Car auto2 = dao.vratiAuto(2);

		  List<Car> ruziniAutici = new ArrayList<Car>(); 
			  ruziniAutici.add(auto1);
			  ruziniAutici.add(auto2);

		  User user = dao.vratiUsera(1);

		  if(dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutici)) {
			  dao.spojiUseraICar(user, ruziniAutici); 
			  }*/
		/*Car auto1 = dao.vratiAuto(2);
		Car auto2 = dao.vratiAuto(3);
		Car auto3 = dao.vratiAuto(5);
		
		
		List<Car> ruziniAutomobili = new ArrayList<Car>();
	
		ruziniAutomobili.add(auto1);
		
		
		
		
		if (dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutomobili)) {
			
			dao.spojiUseraICar(user, ruziniAutomobili);
			
		}*/
		
		/*Car car1 = new Car("crysler", "300c", 2019, 35000, false, VrstaVozila.PUTNICKO);
		Car car2 = new Car("dodge", "caliber", 2017, 100000, false, VrstaVozila.PUTNICKO);
		Car car3 = new Car("lexus", "lc500", 2019, 110000, false, VrstaVozila.PUTNICKO);
		Car car4 = new Car("lada", "niva", 2019, 19000, false, VrstaVozila.TERENAC);
		
		dao.snimiAutoUBazu(car1);
		dao.snimiAutoUBazu(car2);
		dao.snimiAutoUBazu(car3);
		dao.snimiAutoUBazu(car4);*/
		
		
		/*dao.linkujUseraIAuto(1, 1);*/
	/*	
		Car car = new Car("land rover", "discovery", 2018, 39990, false, VrstaVozila.SUV);
	VisitCard visitCard = new VisitCard();
	visitCard.setIme("Ruzica");
	visitCard.setEmail("ruza@gmail.com");
	visitCard.setBrojTelefona("0641234567");
		
		User user = new User();
		user.setUserName("ruza");
		user.setPassword("ruzaprogramer123");
		user.setNovcanik(100000);
		user.setVisitCard(visitCard);
		*/
		
		//dao.snimiUseraUBazu(user);
		//dao.snimiAutoUBazu(car);
		
	}

}
