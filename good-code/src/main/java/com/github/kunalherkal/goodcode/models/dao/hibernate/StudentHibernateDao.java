package com.github.kunalherkal.goodcode.models.dao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.github.kunalherkal.goodcode.hibernate.HibernateUtil;
import com.github.kunalherkal.goodcode.models.Student;
import com.github.kunalherkal.goodcode.models.dao.StudentDao;

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
