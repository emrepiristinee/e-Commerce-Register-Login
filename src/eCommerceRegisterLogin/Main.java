package eCommerceRegisterLogin;

import eCommerceRegisterLogin.AnotherSignUp.FacebookSignUp;
import eCommerceRegisterLogin.business.abstracts.UserLogInService;
import eCommerceRegisterLogin.business.abstracts.UserService;
import eCommerceRegisterLogin.business.concretes.UserEmailAcceptManager;
import eCommerceRegisterLogin.business.concretes.UserLogInManager;
import eCommerceRegisterLogin.business.concretes.UserManager;
import eCommerceRegisterLogin.dataAccess.concretes.AbcProductDao;
import eCommerceRegisterLogin.dataAccess.concretes.HibernateProductDao;
import eCommerceRegisterLogin.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User c1 = new User(1, "Emre", "Piriþtine", "emre@hotmail.com", "123456");
		User c2 = new User(1, "Eren", "Piriþtine", "eren@hotmail.com", "123456");
		User c3 = new User(1, "aaa", "aaasd", "aaa@hotmail.com", "123456");
		UserService manager1 = new UserManager(new HibernateProductDao(), new UserEmailAcceptManager());
		UserService manager2 = new UserManager(new AbcProductDao(), new UserEmailAcceptManager());
		manager1.add(c1);
		manager1.add(c2);
		manager2.add(c3);
		
		UserLogInService logIn1 = new UserLogInManager(); 
		logIn1.LogIn(c1, "emre@hotmail.com", "123456");
		
		FacebookSignUp face = new FacebookSignUp();
		face.signUp();
	}

}
