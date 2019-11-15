package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Car;
import model.User;

public class HibernetDAO {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	
	public boolean snimiAutoUBazu(Car car) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(car);
			sesija.getTransaction().commit();
	return true;		
			
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return false;
		}
		
		finally {
			sesija.close();
		}
		
		
		
	}
public boolean snimiUseraUBazu(User user) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(user);
			sesija.getTransaction().commit();
	return true;		
			
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return false;
		}
		
		finally {
			sesija.close();
		}
		
		
		
	}
	
	public Car vratiAuto(int id) {
		
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		Car car = null;
		
		try {
		car =	sesija.get(Car.class, id);
			sesija.getTransaction().commit();
	return car;		
			
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return null;
		}finally {
			sesija.close();
		}
	}
public void  updateCarPrice(int id, double novaCena) {
		
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		Car car = null;
		
		try {
		car =	sesija.get(Car.class, id);
		car.setCena(novaCena);
		sesija.update(car);
			sesija.getTransaction().commit();
			
			
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			 
		}finally {
			sesija.close();
		}
	}
	
public boolean  deleteCar(int id) {
	
	
	Session sesija = factory.openSession();
	sesija.beginTransaction();
	Car car = null;
	
	try {
	car =	sesija.get(Car.class, id);
	
	sesija.delete(car);
		sesija.getTransaction().commit();
		return true;
		
	} catch (Exception e) {
		sesija.getTransaction().rollback();
		 return false;
	}finally {
		sesija.close();
	}
}
	
public  void linkujUseraIAuto(int idCar, int idUser) {
	Session sesija = factory.openSession();
	sesija.beginTransaction();
	
	Car car;
	User user;
	
	try {
		car = sesija.get(Car.class, idCar);
		user = sesija.get(User.class, idUser);
		
		car.setKorisnik(user);
		user.setAuto(car);
		
		sesija.update(user);
		sesija.update(car);
		
		
		sesija.getTransaction().commit();
		
	} catch (Exception e) {
		sesija.getTransaction().rollback();
		 
	}finally {
		sesija.close();
	}
}

}
