package com.brian.test.componentb.impl;

import com.brian.test.componentb.api.Name;

/**
 * Irish implementation of Name interface
 *
 */
public class IrishName implements Name {

	@Override
	public String getFullName() {
		return "Paddy Flaherty";
	}

}
