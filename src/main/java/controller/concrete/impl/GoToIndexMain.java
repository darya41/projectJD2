package controller.concrete.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bean.News;
import controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToIndexMain implements Command{

	@Override
	public void execute(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
		List<News> newsList = new ArrayList<>();
        newsList.add(new News("Белорусская теннисистка Арина Соболенко блеснула вечерним нарядом накануне турнира года",
                "Белоруска Арина Соболенко блеснула вечерним нарядом накануне турнира года"));
        newsList.add(new News("Секреты долголетия от белорусских врачей 80+: счастье в семье, тяга к знаниям и минимум волнений",
                "Белорусские врачи 80+ рассказали на своем примере, как жить долго и счастливо"));

        request.setAttribute("mainNews", newsList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/index_main.jsp");
        dispatcher.forward(request, response);
		
		
		
	}

}
