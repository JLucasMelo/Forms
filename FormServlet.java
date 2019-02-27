package br.ucsal.FormServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FromServlet
 */
@WebServlet("/FromServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("name");
		String userPass = request.getParameter("password");
		
		response.setContentType("Text/Html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title Login Info");
		out.println("</title>");
		out.println("</head>");
		out.println("<body> Voce entrou no sistema! <br>");
		out.println("<b>");
		out.println(userName);
		out.println("<br>");
		out.println("<b>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
