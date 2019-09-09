package kr.or.ddit.lprod.repository;

import java.util.List;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;

public class LprodDaoMainTest {

	public static void main(String[] args) {

		ILprodService lrpodService = new LprodService();

		List<LprodVo> lprodList = lrpodService.getLprodList();

		if(lprodList.size() == 10)
			System.out.println("db 조회 성공");
		else
			System.out.println("db 조회 실패");

	}

}
