package com.github.kunalherkal.goodcode;

import com.github.kunalherkal.goodcode.views.Home;
import com.google.inject.Guice;
import com.google.inject.Injector;

public final class GoodCodeDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		Home home = injector.getInstance(Home.class);;
		
		home.setVisible(true);
		
	}

}
