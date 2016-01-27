package com.github.kunalherkal.goodcode.dao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.github.kunalherkal.goodcode.Student;
import com.github.kunalherkal.goodcode.dao.StudentDao;
import com.github.kunalherkal.goodcode.hibernate.HibernateUtil;

public final class StudentHibernateDao implements StudentDao {

	@Override
	public void insert(Student student) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
