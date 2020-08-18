package demo.repository;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.entity.User;

@Repository
@Transactional()
public class UserRepository {
	@Autowired
	private SessionFactory sessionFactory;


	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> users = session.createQuery("from User").list();
		System.out.println("users: " + Arrays.asList(users));
		return users;
	}

	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

}
