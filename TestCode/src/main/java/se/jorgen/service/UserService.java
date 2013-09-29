package se.jorgen.service;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import se.jorgen.dao.UserDao;
import se.jorgen.entity.User;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {

	private static Logger logger = Logger.getLogger("UserService");

	@Autowired
	private UserDao userDao;

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findById(int id) {
		logger.info("msg: " + id);
		return userDao.findById(id);
	}

	public void update(User user) {
		userDao.update(user);
	}
}
