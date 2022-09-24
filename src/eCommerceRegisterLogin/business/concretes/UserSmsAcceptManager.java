package eCommerceRegisterLogin.business.concretes;

import eCommerceRegisterLogin.business.abstracts.UserSmsAcceptService;
import eCommerceRegisterLogin.entities.concretes.User;

public class UserSmsAcceptManager implements UserSmsAcceptService{

	@Override
	public void SendVerificationSms(User user) {
		System.out.println("Telefonuna doðrulama mesajý gönderildi.");
		
	}

	@Override
	public void isAcceptPhoneNumber(User user) {
		System.out.println("Telefon numaran doðrulandý.");
		
	}

}
