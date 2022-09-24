package eCommerceRegisterLogin.business.abstracts;

import eCommerceRegisterLogin.entities.concretes.User;

public interface UserEmailAcceptService  {
	void SendVerificationEmail(User user);
	void LinkClikked(User user);
}
