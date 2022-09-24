package eCommerceRegisterLogin.business.concretes;

import eCommerceRegisterLogin.business.abstracts.UserLogInService;
import eCommerceRegisterLogin.entities.concretes.User;

public class UserLogInManager implements UserLogInService{


	@Override
	public void LogIn(User user, String email, String password) {
		if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
			System.out.println("Log In baþarýlý " + user.getName());
		}
		else
			System.out.println("Kullanýcý adý veya þifre yalnýþ");
	}

}
