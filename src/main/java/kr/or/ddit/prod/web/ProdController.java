package kr.or.ddit.prod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.repasitory.IProdDao;
import kr.or.ddit.prod.repasitory.ProdDao;
import kr.or.ddit.user.model.User;

@WebServlet("/prodList")
public class ProdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IProdDao prodDao;

	@Override
	public void init() throws ServletException {
		prodDao = new ProdDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lprodGu = request.getParameter("lprod_Gu");

		List<ProdVo> prodList = prodDao.getProdList(lprodGu);

		request.setAttribute("prodList", prodList);

		request.getRequestDispatcher("/prod/prodList.jsp").forward(request, response);
	}

}
