package com.techyolk.hms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techyolk.hms.dao.UserDao;
import com.techyolk.hms.model.User;

@Repository
@Component("userDao")
public class UserDaoImpl implements UserDao {

	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		if (sessionFactory == null) {
			throw new IllegalStateException("SessionFactory Object is NULL");
		}
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
	
	@Override
	@Transactional
	public void addUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = this.sessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(user);
			session.persist(user);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = this.sessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		Session session = null;
		Transaction tx = null;
		List<User> listUsers=null;
		try {
			session = this.getCurrentSession();
			tx = session.beginTransaction();
			//listUsers= session.createQuery("from User").list();
			listUsers=session.createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
		return listUsers;
	}

	@Override
	@Transactional
	public User getUserByName(String username) {
		Session session = null;
		Transaction tx = null;
		//List<User> users=null;
		User user=null;
		try {
			session = this.sessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			//users = session.createQuery("from User where username=?").setParameter(0, username).list();
			Criteria criteria=session.createCriteria(User.class).add(Restrictions.eq("username", username));
			user=(User) criteria.uniqueResult();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
		

		return user;
		
		/*if (users.size() > 0) {
			return users.get(0);
		}
		return null;*/
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		Session session = null;
		Transaction tx = null;
		try {
			session = this.sessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			
			User user = (User) session.load(User.class, new Integer(id));

			if (user != null) {
				session.delete(user);
			}
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
		
	}

}
