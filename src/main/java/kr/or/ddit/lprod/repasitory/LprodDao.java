package kr.or.ddit.lprod.repasitory;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.MybatisUtil;

public class LprodDao implements ILprodDao {

	/**
	 *
	 * Method : getLprodList
	 * 작성자 : PC-11
	 * 변경이력 :
	 * @return
	 * Method 설명 : db에 있는 lprod정보 가져오기
	 */
	@Override
	public List<LprodVo> getLprodList() {

		SqlSession sqlSession = MybatisUtil.getSession();
		List<LprodVo> lprodList = sqlSession.selectList("lprod.getLprodList");
		sqlSession.close();

		return lprodList;
	}

}
