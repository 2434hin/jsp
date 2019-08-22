package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.service.UserService;

public class LprodServiceTest {

	private ILprodService lprodService;

	@Before
	public void setup() {
		lprodService = new LprodService();
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
		List<LprodVo> lprodList = lprodService.getLprodList();

		/***Then***/
		assertEquals(10, lprodList.size());

	}

	@Test
	public void getLprodPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);

		/***When***/
		Map<String, Object> resultMap = lprodService.getLprodPagingList(page);
		List<LprodVo> lprodList = (List<LprodVo>) resultMap.get("lprodList");
		int paginationSize = (Integer)resultMap.get("paginationSize");

		/***Then***/
		assertEquals(5, lprodList.size());
		assertEquals(2, paginationSize);
	}

	@Test
	public void ceilingTest() {
		/***Given***/
		int totalCnt = 10;
		int pagesize = 5;

		/***When***/
		double paginationSize = Math.ceil((double)totalCnt / pagesize);

		/***Then***/
		assertEquals(2, (int)paginationSize);
	}
}
