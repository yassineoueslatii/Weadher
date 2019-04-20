package com.yassine.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.yassine.daoImpl.MeteoImpl;
import com.yassine.entities.Meteo;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = "Yassine OUESLATI";
		request.setAttribute("nom",nom);
		com.yassine.entities.Meteo meteo= new com.yassine.entities.Meteo("test", "desc");
		MeteoImpl daoImpl=new MeteoImpl();
		//daoImpl.save(meteo);
		List<Meteo> meteos=daoImpl.getListMeteo();
		request.setAttribute("lists", meteos);
		for (Meteo meteo2 : meteos) {
			System.out.println(meteo2.getCode());
			
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
