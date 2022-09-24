package eCommerceRegisterLogin.core;

import eCommerceRegisterLogin.entities.concretes.User;

public interface SignUpService {
	void facebookSignUp(User user);
	void googleSignUp(User user);
}
