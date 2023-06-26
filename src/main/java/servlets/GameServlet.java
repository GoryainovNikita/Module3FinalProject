package servlets;

import game.Choice0;
import game.GameChoice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/game")
public class GameServlet extends HttpServlet {

    private int countOfAttempts = 0;
    private GameChoice gameChoice = new Choice0();
    private HttpSession session;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setAttributeForJsp(gameChoice,req);
        session = req.getSession();
        session.setAttribute("obj", gameChoice);
        req.getRequestDispatcher("/WEB-INF/jsp/game.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameChoice gameChoice1 = (GameChoice) session.getAttribute("obj");
        GameChoice gameChoice2 = gameChoice1.setNext(Integer.parseInt(req.getParameter("question")));
        if(!gameChoice2.winner()){
            setAttributeForJsp(gameChoice2,req);
            session.setAttribute("obj",gameChoice2);
            req.getRequestDispatcher("/WEB-INF/jsp/game.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("text", gameChoice2.getText());
            countOfAttempts++;
            req.setAttribute("attempts", countOfAttempts);
            req.getRequestDispatcher("/WEB-INF/jsp/final.jsp").forward(req,resp);
        }
    }
    protected void setAttributeForJsp(GameChoice gameChoice, HttpServletRequest request) {
        request.setAttribute("text", gameChoice.getText());
        request.setAttribute("choice1", gameChoice.getChoice1());
        request.setAttribute("choice2", gameChoice.getChoice2());
        request.setAttribute("choice3", gameChoice.getChoice3());
    }
}
