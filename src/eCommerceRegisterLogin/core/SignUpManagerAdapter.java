package eCommerceRegisterLogin.core;

import eCommerceRegisterLogin.AnotherSignUp.FacebookSignUp;
import eCommerceRegisterLogin.AnotherSignUp.GoogleSignUp;
import eCommerceRegisterLogin.entities.concretes.User;

public class SignUpManagerAdapter implements SignUpService {


	@Override
	public void facebookSignUp(User user) {
		FacebookSignUp face = new FacebookSignUp();
		face.signUp();		
	}

	@Override
	public void googleSignUp(User user) {
		GoogleSignUp google = new GoogleSignUp();
		google.signUp();
	}

}
