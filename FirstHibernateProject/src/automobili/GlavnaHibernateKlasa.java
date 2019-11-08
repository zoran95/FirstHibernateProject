package automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import controller.HibernetDAO;
import model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
		HibernetDAO dao = new HibernetDAO();
		
		//Car car = new Car("maserati","ghilbi", 2016, 0.18, true);
	//	dao.snimiAutoUBazu(car);
		
		Car car = dao.vratiAuto(2);
		dao.updateCarPrice(car.getIdCar(), 180000);
		System.out.println("Uzeo si auto " + car.getMarka() + " "+ car.getModel());
		System.out.println("Nova cena je " + car.getCena());
		
		
		
	}

}
