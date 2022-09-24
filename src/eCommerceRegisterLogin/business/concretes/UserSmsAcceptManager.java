package eCommerceRegisterLogin.business.concretes;

import eCommerceRegisterLogin.business.abstracts.UserSmsAcceptService;
import eCommerceRegisterLogin.entities.concretes.User;

public class UserSmsAcceptManager implements UserSmsAcceptService{

	@Override
	public void SendVerificationSms(User user) {
		System.out.println("Telefonuna do�rulama mesaj� g�nderildi.");
		
	}

	@Override
	public void isAcceptPhoneNumber(User user) {
		System.out.println("Telefon numaran do�ruland�.");
		
	}

}
