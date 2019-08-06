package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

	/**
	 * Method : getUserList
	 * 작성자 : PC-11
	 * 변경이력 :
	 * @return
	 * Method 설명 :
	 */
	@Override
	public List<UserVO> getUserList() {
		
		// db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//		List<UserVO> userList = new ArrayList<UserVO>();
//		userList.add(new UserVO("brown"));
//		userList.add(new UserVO("cony"));
//		userList.add(new UserVO("sally"));
		
		SqlSession sqlSession = MybatisUtil.getSession();
		List<UserVO> userList = sqlSession.selectList("user.getUserList");
		sqlSession.close();
		
		return userList;
	}

	/**
	 * 
	 * Method : getUser
	 * 작성자 : PC-11
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : userId를 갖는  사용자 정보 조회
	 */
	@Override
	public UserVO getUser(String userId) {
		SqlSession sqlSession = MybatisUtil.getSession();
		UserVO userVo = sqlSession.selectOne("user.getUser", userId);
		sqlSession.close();
		return userVo;
	}

	
}
