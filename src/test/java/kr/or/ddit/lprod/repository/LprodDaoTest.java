package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.UserDao;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest {

	private ILprodDao lprodDao;
	private SqlSession sqlSession;

	@Before
	public void setup() {
		lprodDao = new LprodDao();
		sqlSession = MybatisUtil.getSession();
	}

	// 테스트에 공통적으로 사용한 자원을 해제
	@After
	public void tearDown() {
		sqlSession.close();
	}

	/**
	 *
	 * Method : getLprodListTest
	 * 작성자 : PC-11
	 * 변경이력 :
	 * Method 설명 : getLprodList 테스트
	 */
	@Test
	public void getLprodListTest() {

		/***Given***/

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodList(sqlSession);

		/***Then***/
		assertEquals(10, lprodList.size());

	}

	/**
	 *
	 * Method : getLprodPagingList
	 * 작성자 : PC-11
	 * 변경이력 :
	 * Method 설명 : 제품그룹 페이징 리스트 조회
	 */
	@Test
	public void getLprodPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodPagingList(sqlSession, page);

		/***Then***/
		assertEquals(5, lprodList.size());
	}

	@Test
	public void getLprodTotalCnt() {
		/***Given***/

		/***When***/
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);

		/***Then***/
		assertEquals(10, totalCnt);
	}
}
