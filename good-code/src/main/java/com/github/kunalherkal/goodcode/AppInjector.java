package com.github.kunalherkal.goodcode;

import com.github.kunalherkal.goodcode.models.dao.StudentDao;
import com.github.kunalherkal.goodcode.models.dao.hibernate.StudentHibernateDao;
import com.github.kunalherkal.goodcode.views.Home;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public final class AppInjector extends AbstractModule{

	@Override
	protected void configure() {
		bind(StudentDao.class).to(StudentHibernateDao.class).in(Singleton.class);
		bind(Home.class).in(Singleton.class);
	}

}
