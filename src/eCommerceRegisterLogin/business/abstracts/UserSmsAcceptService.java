package eCommerceRegisterLogin.business.abstracts;

import eCommerceRegisterLogin.entities.concretes.User;

public interface UserSmsAcceptService {
	void SendVerificationSms(User user);
	void isAcceptPhoneNumber(User user);
}
