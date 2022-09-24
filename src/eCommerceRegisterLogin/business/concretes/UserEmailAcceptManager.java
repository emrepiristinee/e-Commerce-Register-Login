package eCommerceRegisterLogin.business.concretes;

import eCommerceRegisterLogin.business.abstracts.UserEmailAcceptService;
import eCommerceRegisterLogin.entities.concretes.User;

public class UserEmailAcceptManager implements UserEmailAcceptService {

	@Override
	public void SendVerificationEmail(User user) {
		System.out.println(user.getEmail() + " mailine do�rulama postas� g�nderildi");
	}

	@Override
	public void LinkClikked(User user) {
		System.out.println(user.getEmail() + " do�ruland�, �yelik tamamland�.");

	}

}
