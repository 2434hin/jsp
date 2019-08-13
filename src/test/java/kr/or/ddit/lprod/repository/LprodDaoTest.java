package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;

public class LprodDaoTest {

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
		ILprodDao lprodDao = new LprodDao();

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodList();

		/***Then***/
		assertEquals(10, lprodList.size());

	}

}
