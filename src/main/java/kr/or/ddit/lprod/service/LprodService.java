package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repasitory.ILprodDao;
import kr.or.ddit.lprod.repasitory.LprodDao;
import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class LprodService implements ILprodService{

	private ILprodDao lprodDao;

	public LprodService() {
		lprodDao = new LprodDao();
	}

	@Override
	public List<LprodVo> getLprodList() {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<LprodVo> lpordList = lprodDao.getLprodList(sqlSession);
		sqlSession.close();

		return lpordList;
	}

	@Override
	public Map<String, Object> getLprodPagingList(Page page) {
		Map<String, Object> map = new HashMap<String, Object>();

		SqlSession sqlSession = MybatisUtil.getSession();

		List<LprodVo> lprodList = lprodDao.getLprodPagingList(sqlSession, page);
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);

		map.put("lprodList", lprodList);
		map.put("paginationSize", (int)Math.ceil((double)totalCnt / page.getPagesize()));

		sqlSession.close();
		return map;
	}


}
