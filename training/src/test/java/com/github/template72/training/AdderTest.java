package com.github.template72.training;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	@Test
	public void add() {
		Assert.assertEquals(3, new Adder().add(1, 2));
	}

	@Test
	public void zero() {
		Assert.assertEquals(0, new Adder().add(0, 0));
	}
}
