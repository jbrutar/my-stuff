package se.jorgen.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import se.jorgen.dao.UserDao;
import se.jorgen.entity.User;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
	return userDao.findAll();
    }

    public User findById(int id) {
	return userDao.findById(id);
    }
}
