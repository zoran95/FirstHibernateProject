package automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Car car = new Car("bugatti","chiron", 2018, 3.1, false);
		
		
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(car);
			System.out.println("Ubacio sam u bazu");
			
			sesija.getTransaction().commit();
			
		} catch (Exception e) {
			
			sesija.getTransaction().rollback();
		}
		
		
		
		
		sesija.close();

	}

}
