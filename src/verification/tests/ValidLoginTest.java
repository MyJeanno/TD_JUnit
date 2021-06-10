package verification.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import demo.ValidLogin;

class ValidLoginTest {

	@Before
	public void before() {
		System.out.println("Avant");
	}

	@Test
	void test() throws Exception {
		ValidLogin login = new ValidLogin();
		boolean res = login.isValid("Jean", "1234", "1234");
		Assert.assertTrue("Ce test devrait être vrai", res);
	}

	@Test
	void test2() throws Exception {
		ValidLogin login = new ValidLogin();
		boolean res = login.isValid("", "1234", "1234");
		Assert.assertTrue("Ce test devrait être vrai", res);
	}

	@Test
	void test3() throws Exception {
		ValidLogin login = new ValidLogin();
		boolean res = login.isValid("j", "1234", "1234");
		Assert.assertTrue("Ce test devrait être faux", (res == false));
	}

}
