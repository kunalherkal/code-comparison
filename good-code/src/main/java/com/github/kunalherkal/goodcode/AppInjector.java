package com.github.kunalherkal.goodcode;

import com.github.kunalherkal.goodcode.dao.StudentDao;
import com.github.kunalherkal.goodcode.dao.hibernate.StudentHibernateDao;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public final class AppInjector extends AbstractModule{

	@Override
	protected void configure() {
		bind(StudentDao.class).to(StudentHibernateDao.class).in(Singleton.class);
	}

}
