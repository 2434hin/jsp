package kr.or.ddit.prod.repasitory;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.MybatisUtil;

public class ProdDao implements IProdDao {

	/**
	 *
	 * Method : getProdList
	 * 작성자 : PC-11
	 * 변경이력 :
	 * @param lprodGu
	 * @return
	 * Method 설명 : lprodGu를 갖는 prod정보 조회
	 */
	@Override
	public List<ProdVo> getProdList(String lprodGu) {

		SqlSession sqlSession = MybatisUtil.getSession();
		List<ProdVo> prodList = sqlSession.selectList("prod.getProdList", lprodGu);
		sqlSession.close();

		return prodList;
	}

}
