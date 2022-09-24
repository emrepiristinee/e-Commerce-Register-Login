package eCommerceRegisterLogin.dataAccess.concretes;

import java.util.List;

import eCommerceRegisterLogin.dataAccess.abstracts.UserDao;
import eCommerceRegisterLogin.entities.concretes.User;

public class AbcProductDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName() + " Abc ile eklendi.");

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
