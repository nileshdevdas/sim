package com.vinsys.app;

import junit.framework.TestCase;

public class ProceessRequestTest extends TestCase {

	public void testProcess() {
		assert (new ProceessRequest().process().equals("PROCESS"));
	}

}
