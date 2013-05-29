package se.jorgen.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import se.jorgen.entity.User;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<User> findAll() {
	Query query = entityManager.createQuery("from User");
	return query.getResultList();
    }

    public User findById(int id) {
	return entityManager.find(User.class, id);
    }

    public User update(User user) {
	entityManager.persist(user);
	return user;
    }
}
