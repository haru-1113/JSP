package signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignServlet
 */
@WebServlet("/SignServlet")
public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int rrn = Integer.parseInt(request.getParameter("rrn"));
		int rrn2 = Integer.parseInt(request.getParameter("rrn2"));
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String e_mail = request.getParameter("e_mail");
		String dotcomlist = request.getParameter("dotcomlist");
		String dotcom = request.getParameter("dotcom");
		String addnum = request.getParameter("addnum");
		String addr = request.getParameter("addr");
		String pnum = request.getParameter("pnum");
		String jobs[] = request.getParameterValues("job");
		String items[] = request.getParameterValues("item");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("이름 : <b>");
		out.println(name);
		out.println("</b><br>주민등록번호 : <b>");
		out.println(rrn);
		out.println("-" + rrn2);
		out.println("</b><br>아이디 : <b>");
		out.println(id);
		out.println("</b><br>비밀번호 :<b>");
		out.println(pwd);
		out.println("</b><br>이메일 : <b>");
		out.println(e_mail);
		out.println("@");
		if (dotcomlist == "직접입력") {
			out.println(dotcom);
		} else {
			out.println(dotcomlist);
		}
		out.println("</b><br>우편번호 : <b>");
		out.println(addnum);
		out.println("</b><br>주소 : <b>");
		out.println(addr);
		out.println("</b><br>핸드폰번호:<b>");
		out.println(pnum);
		out.println("</b><br>직업 :<b>");
		if (jobs == null) {
			out.println("선택한 항목이 없습니다.");
		} else {
			for (String job : jobs)
				out.println(job);
		}
		out.println("</b><br>관심분야:<b>");
		if (items == null) {
			out.println("선택한 항목이 없습니다.");
		} else {
			for (String item : items) {
				out.println(item + " ");
			}
		}
		out.println("</b><br><a href ='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
