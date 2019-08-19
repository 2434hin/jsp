package kr.or.ddit.prod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;
import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.repasitory.IProdDao;
import kr.or.ddit.prod.repasitory.ProdDao;

public class ProdDaoTest {

	/**
	 *
	 * Method : getProdListTest
	 * 작성자 : PC-11
	 * 변경이력 :
	 * Method 설명 : getProdList 테스트
	 */
	@Test
	public void getProdListTest() {

		/***Given***/
		IProdDao prodDao = new ProdDao();
		String lprodGu = "P101";

		/***When***/
		List<ProdVo> prodList = prodDao.getProdList(lprodGu);

		/***Then***/
		assertEquals(6, prodList.size());

	}

}
