package MKF;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
//    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws  IOException {
//        int k=(int)req.getAttribute("k");
//        int k=Integer.parseInt(req.getParameter("k"));

//        HttpSession session=req.getSession();
//        int k= (int)session.getAttribute("k");
        int k=0;
        Cookie cookies[]=req.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals("k"))
                k=Integer.parseInt(c.getValue());
        }

        k=k*k;
        PrintWriter out=res.getWriter();
        out.println("Result is "+k);
//        PrintWriter out=res.getWriter();
//        out.println("It is redirected to sq ");

    }
}
