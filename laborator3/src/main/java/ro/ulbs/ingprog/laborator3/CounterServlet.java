package ro.ulbs.ingprog.laborator3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", value = "/CounterServlet")
public class CounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer counterGet = (Integer)
                request.getSession().getAttribute("CounterGetName");
        if (counterGet == null) {
            counterGet = 0;
        }
        String increment = request.getParameter("inc");
        if (increment != null) {
            try{
                counterGet+= Integer.parseInt(increment);
            }
            catch(NumberFormatException e){
            }
        }

        String decrement = request.getParameter("dec");
        if (decrement != null) {
            try{
                counterGet-= Integer.parseInt(decrement);
            }
            catch(NumberFormatException e){
            }
        }

        if(counterGet==0)
            request.getSession().setAttribute("WarningGet",true);
        else
            request.getSession().setAttribute("WarningGet",false);

        request.getSession().setAttribute("CounterGetName", counterGet);
        status(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer counterPost = (Integer)
                request.getSession().getAttribute("CounterPostName");
        if (counterPost == null) {
            counterPost = 0;
        }
        String increment = request.getParameter("inc");
        if (increment != null) {
            try{
                counterPost+= Integer.parseInt(increment);
            }
            catch(NumberFormatException e){
            }
        }

        String decrement = request.getParameter("dec");
        if (decrement != null) {
            try{
                counterPost-= Integer.parseInt(decrement);
            }
            catch(NumberFormatException e){
            }
        }

        if(counterPost==0)
            request.getSession().setAttribute("WarningPost",true);
        else
            request.getSession().setAttribute("WarningPost",false);


        request.getSession().setAttribute("CounterPostName", counterPost);
        status(request, response);
    }

    private void status(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h2>Welcome to Counter Servlet</h2>");

        Integer counterGet = (Integer)
                request.getSession().getAttribute("CounterGetName");
        printWriter.println("<br> Counter for GET: " + counterGet);

        Integer counterPost = (Integer)
                request.getSession().getAttribute("CounterPostName");
        printWriter.println("<br> Counter for POST: " + counterPost);

        Boolean warningGet = (Boolean)
                request.getSession().getAttribute("WarningGet");
        if(warningGet!=null && warningGet==true){
            printWriter.println("<br><span style='color: red'>WARNING GET");
        }

        Boolean warningPost = (Boolean)
                request.getSession().getAttribute("WarningPost");
        if(warningPost!=null && warningPost==true) {
            printWriter.println("<br><span style='color: red'>WARNING POST");
        }
    }

}