package kr.or.ddit.lprod.repository;

import java.util.List;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;

public class LprodDaoMainTest {

	public static void main(String[] args) {

		ILprodDao lprodDao = new LprodDao();

		List<LprodVo> lprodList = lprodDao.getLprodList();

		if(lprodList.size() == 10)
			System.out.println("db 조회 성공");
		else
			System.out.println("db 조회 실패");

	}

}
