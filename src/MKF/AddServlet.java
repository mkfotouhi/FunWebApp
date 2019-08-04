package MKF;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
//    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        int k=i+j;
//        req.setAttribute("k",k);
//        PrintWriter out=res.getWriter();
//        out.println("result is:"+k);
//        RequestDispatcher rd=req.getRequestDispatcher("sq");
//        rd.forward(req,res);

//        HttpSession session=req.getSession();
//        session.setAttribute("k",k);
        Cookie cookie=new Cookie("k",k+"");
        res.addCookie(cookie);

        res.sendRedirect("sq");
    }
}
