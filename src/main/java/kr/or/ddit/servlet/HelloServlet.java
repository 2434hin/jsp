package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//J2EE 기반의 웹 어플리케이션 개발시 main method를 통해 실행하지 않는다.
//우리가 작성한 웹 어플리케이션을(war) was(tomcat)의 webapps 폴더 밑에 이동시켜 주면
//서버가 기동할때 해당 어플리케이션을 자동으로 로딩
//웹 어플리케이션의 폴더 명이 context path가 된다 ( 웹 어플리케이션 이름 )
//*** 서버 설정에 의해서 폴더명과 다른 context path를 부여하는게 기능
//(하지만 우리는 서버 엔지니어가 아니기 때문에 해당 부분까지는 가지 않는다.)

// 특정 url을 호출하면 , url을 처리해줄 수 있는 servlet을 호출하여 응답을 생성한다.
// servlet 생성 방법
// 1. class 를 생성
// 2. HttpServlet 클래스를 상속을 한다.(J2EE spec을 따른다)
// 3. doGet, doPost 메소드를 오바라이딩 한다.
// 4. 어떤 url을 해당 서블릿에서 처리할지 매핑
// (web.xml, servlet 3.0이후 부터는 servlet class 어노테이션으로 설정)

public class HelloServlet extends HttpServlet {
	
	private Logger logger = LoggerFactory.getLogger(HelloServlet.class);
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		//System.out.println("HelloServlet init()");
		logger.debug("HelloServlet init() : {}", config.getInitParameter("test"));
	}

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
	  SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
	  Date time = new Date();
	  
      resp.setContentType("text/html; charset = UTF-8");
      
      PrintWriter pw =  resp.getWriter();
      pw.println("<html>");	// :) 소스보기에서 줄바꿈 기능
      pw.println("   <head>");
      pw.println("      <title>helloServlet</title>");
      pw.println("   </head>");
      pw.println("   <body>");
      pw.println("      <h1>hello, world 한글 테스트</h1>");
      pw.println("      <h1>Today : " + fm.format(time) + "</h1>");
      pw.println("   </body>");
      pw.println("</html>");
     
   }


}