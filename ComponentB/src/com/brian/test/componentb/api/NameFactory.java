package com.brian.test.componentb.api;

import com.brian.test.componentb.impl.IrishName;

/**
 * Factory class to return an implementation of Name
 *
 */
public class NameFactory {

	public static Name getName(){
		return new IrishName();
	}
}
