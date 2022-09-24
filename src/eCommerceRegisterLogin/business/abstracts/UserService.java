package eCommerceRegisterLogin.business.abstracts;

import java.util.List;

import eCommerceRegisterLogin.entities.concretes.User;

public interface UserService {
	void add(User user);
	Boolean isEmailUnique();
	List<User> getAll();
}
