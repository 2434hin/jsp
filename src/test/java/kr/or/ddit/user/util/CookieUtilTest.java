package kr.or.ddit.user.util;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.or.ddit.util.CookieUtil;

public class CookieUtilTest {
	
	/**
	 * 
	 * Method : getCookieTest
	 * 작성자 : PC-11
	 * 변경이력 :
	 * Method 설명 : 쿠키 가져오기
	 */
	@Test
	public void getCookieTest() {
		/***Given***/
		String cookieString = "userId=brown; rememberMe=Y; test=testValue";
		
		/***When***/
		String userIdCookieValue = CookieUtil.getCookie(cookieString, "userId");
		String rememberMeCookieValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String testCookieValue = CookieUtil.getCookie(cookieString, "test");
		String notExistsCookieValue = CookieUtil.getCookie(cookieString, "notExists");

		/***Then***/
		assertEquals("brown", userIdCookieValue);
		assertEquals("Y", rememberMeCookieValue);
		assertEquals("testValue", testCookieValue);
		assertNull(notExistsCookieValue);

	}
}
