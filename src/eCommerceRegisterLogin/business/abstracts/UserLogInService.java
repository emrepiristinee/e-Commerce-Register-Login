package eCommerceRegisterLogin.business.abstracts;

import eCommerceRegisterLogin.entities.concretes.User;

public interface UserLogInService {
	void LogIn(User user, String email, String password);
}
