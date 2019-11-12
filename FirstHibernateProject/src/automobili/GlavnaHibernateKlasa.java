package automobili;



import controller.HibernetDAO;
import model.Car;
import model.User;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
		HibernetDAO dao = new HibernetDAO();
		
		Car car = new Car("land rover", "discovery", 2018, 39990, false);
	
		User user = new User();
		user.setUserName("ruza");
		user.setPassword("ruzaprogramer123");
		user.setNovcanik(100000);
		
		dao.snimiAutoUBazu(car);
		dao.snimiUseraUBazu(user);
	}

}
