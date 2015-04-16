package com.brian.test.componenta.impl;

import com.brian.test.componenta.api.HelloWorld;
import com.brian.test.componentb.api.NameFactory;

/**
 * Irish implementation of HelloWorld interface
 *
 */
public class HelloIreland implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Dia duit " + NameFactory.getName().getFullName());		
	}

}
